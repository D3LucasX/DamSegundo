package ejerciciosDeEscritura_SegundaTarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio4_leerDosArchivosYcopiarloEnOtroLado {

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
			
			try {
				if(!ficheroNuevo.exists()) {
					ficheroNuevo.createNewFile();
				}
				// Abro primero para lectura
				FileReader Lecturaf1 new FileReader(fichero1Prog);
				BufferedReader bufferLectura = new BufferedReader(Lecturaf1);
				
				String linea;
				while (linea = bufferLectura.readLine() != null) {
					
				}
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
