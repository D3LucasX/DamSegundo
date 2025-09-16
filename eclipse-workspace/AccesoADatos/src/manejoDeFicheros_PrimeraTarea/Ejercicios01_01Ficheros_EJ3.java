package manejoDeFicheros_PrimeraTarea;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicios01_01Ficheros_EJ3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dentro de que directorio quieres crear el fichero?: (Escribe la ruta) ");
		String directorio = entrada.nextLine();
		System.out.println("Como quieres que se llame el fichero?: ");
		String nombreFichero = entrada.nextLine();
		
		File carpeta = new File(directorio);
		
		if (carpeta.exists() && carpeta.isDirectory()) {
			File nuevoFichero = new File(carpeta, nombreFichero);
			
			try {
				if (nuevoFichero.createNewFile()) {
					System.out.println("Fichero creado: " + nuevoFichero.getAbsolutePath());
				}else {
					System.out.println("El fichero ya existia: " + nuevoFichero.getAbsolutePath());
				}
			}catch(IOException e) {
				System.out.println("Error al crear el fichero.");
				e.getMessage();
			}
		}else {
			System.out.println("El directorio no existe.");
		}
	}

}
