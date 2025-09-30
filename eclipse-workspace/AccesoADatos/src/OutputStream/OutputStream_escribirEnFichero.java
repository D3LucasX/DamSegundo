package OutputStream;
import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class OutputStream_escribirEnFichero {
public static void LecturaDatos() {
	try {
		DataInputStream dis = new DataInputStream(new FileInputStream("datos.bin"));
		int entero = dis.readInt();
		double numero = dis.readDouble();
		boolean booleano = dis.readBoolean();
		String frase = dis.readUTF();
		
		System.out.println("Enteo = " + entero + ", Decimal = " + numero + ", Booleano = " + booleano + ", frase = " + frase + ".");
	}catch(IOException e) {
		e.printStackTrace();
	}
}
public static void EscrituraDatos() {
	File ficherosDatos = new File("datos.bin");
	try {
		if (!ficherosDatos.exists()) {
			ficherosDatos.createNewFile();
		}
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(ficherosDatos)); 
		dos.writeInt(2);
		dos.writeDouble(1.2);
		dos.writeBoolean(false);
		dos.writeUTF("hola como vas?");
		
		
	}catch(IOException e) {
		e.printStackTrace();
	}
}

public static void EscribirPersonas (ArrayList<Persona> listaPersonas) {
	String fichero = "personas.dat";
	File ficheroEscritura = new File(fichero);
	
	if (!ficheroEscritura.exists()) {
		try {
			ficheroEscritura.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}else {
		if(ficheroEscritura.isFile()) {
			try {
				// Lo abro para escritura y escribo un flujo de datos
				FileOutputStream fos = new FileOutputStream(ficheroEscritura);
				// El tipo de objetos que tiene que transformar es un objeto en bytes
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				// Escribimos el array en bytes
				oos.writeObject(listaPersonas);
				oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Fichero es un directorio, no un fichero.");
		}
	}
}


	public static void main (String args[]) {
		ArrayList <Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("Ana", 23));
		listaPersonas.add(new Persona("Luis", 23));
		listaPersonas.add(new Persona("Roberto", 23));
		
		EscribirPersonas (listaPersonas);
		EscrituraDatos();
		LecturaDatos();
	}
}
