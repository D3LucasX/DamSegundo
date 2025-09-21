package ejerciciosDeEscritura_SegundaTarea;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3_guardardarNumerosPositivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombreArchivo = "";
		int numeroPosPedido = -1;
		File directorio;
		do {
			System.out.println("En que carpeta desea crear el archivo?: (Introduce la ruta)");
			String carpeta = entrada.nextLine();
			directorio = new File(carpeta);
			if(!directorio.exists() || !directorio.isDirectory()) {
				System.out.println("La ruta no es valida, inténtelo de nuevo.");
			}
		}while(!directorio.exists() || !directorio.isDirectory());
		
		
		System.out.println("Como se llamará tu archivo?: ");
		nombreArchivo = entrada.nextLine();
		File nuevoArchivo = new File(directorio, nombreArchivo);
		
		try {
			if (nuevoArchivo.createNewFile()) {
				System.out.println("Archivo creado: " + nuevoArchivo.getAbsolutePath());
			}else {
				System.out.println("El archivo ya existia en esa carpeta.");
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoArchivo));
			String linea;
			System.out.println("Introduce 5 numeros aleatorios positivos: ");
			for (int i = 0; i < 5; i++) {
				while(numeroPosPedido < 0) {
					System.out.println("Introduce el " + (i+1) + " º número: ");
					numeroPosPedido = entrada.nextInt();
					entrada.nextLine();
				}
				writer.write(Integer.toString(numeroPosPedido) + ", ");
				numeroPosPedido = -1;
			}
			writer.close();
			System.out.println("Archivo modificado correctamente. (ruta: " + nuevoArchivo.getAbsolutePath() + " )");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
