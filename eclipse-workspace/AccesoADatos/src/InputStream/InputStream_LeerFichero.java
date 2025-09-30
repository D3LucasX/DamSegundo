package InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import OutputStream.Persona;

public class InputStream_LeerFichero {

	public static void LecturaPersona() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"));
			ArrayList <Persona> personas = (ArrayList<Persona>)ois.readObject();
			System.out.println("Las perosnas almacenadas en el fichero son: ");
			for(Persona p:personas) {
				System.out.println(p);
			}
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ArrayList <Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("Ana", 23));
		listaPersonas.add(new Persona("Luis", 23));
		listaPersonas.add(new Persona("Roberto", 23));
		
		LecturaPersona ();
	}

}
