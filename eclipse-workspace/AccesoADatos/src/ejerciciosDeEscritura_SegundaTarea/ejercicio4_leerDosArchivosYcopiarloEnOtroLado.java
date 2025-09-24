package ejerciciosDeEscritura_SegundaTarea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio4_leerDosArchivosYcopiarloEnOtroLado {
	public static void lecturaFicheros(File fichero, File ficheroEscritura) {
		try {
			// Abro primero para lectura
			FileReader lecturaf1 = new FileReader(fichero);
			BufferedReader bufferLectura = new BufferedReader(lecturaf1);
			
			String linea;
			while ((linea = bufferLectura.readLine()) != null) {
				// leo las lineas
				 System.out.println(linea);
				 escribirFicheros(linea, ficheroEscritura);
			}
			bufferLectura.close(); // cerramos el buffer para liverarlo
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void escribirFicheros(String linea, File ficheroEscritura) {
		// abrimos el fichero para escritura
		try {
			FileWriter fE = new FileWriter(ficheroEscritura, true); // el true se pone para que no sobreescriba siempre la misma linea
			BufferedWriter Escritura = new BufferedWriter(fE);
			
			Escritura.write(linea);
			Escritura.newLine();
			
			Escritura.close();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero 1");
		String fichero1 = entrada.nextLine();
		System.out.println("Introduce el nombre del fichero 2");
		String fichero2 = entrada.nextLine();
		System.out.println("Introduce el nombre de la ruta");
		String ruta = entrada.nextLine();
		
		File rutaPrograma = new File(ruta);
		if (rutaPrograma.isDirectory() && rutaPrograma.exists() ) {
			File fichero1Prog =new File(rutaPrograma, fichero1);
			File fichero2Prog =new File(rutaPrograma, fichero2);
			String nombreNuevo = fichero1 + "_" + fichero2;
			File ficheroNuevo = new File(rutaPrograma,nombreNuevo);
			
			if (fichero1Prog.exists() && fichero2Prog.exists() && fichero1Prog.isFile() && fichero2Prog.isFile()) {
			
				try {
					if(!ficheroNuevo.exists()) {
						ficheroNuevo.createNewFile();
					}
					lecturaFicheros(fichero1Prog, ficheroNuevo);
					lecturaFicheros(fichero2Prog, ficheroNuevo);
					
				}catch(IOException e) {
					e.printStackTrace();
				}
					
			}else {
					System.out.println("No existen los ficheros.");
			}
		}
	}
}

