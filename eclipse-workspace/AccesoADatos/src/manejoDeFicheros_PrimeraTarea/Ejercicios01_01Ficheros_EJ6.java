package manejoDeFicheros_PrimeraTarea;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicios01_01Ficheros_EJ6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("En que directorio quieres crear el archivo?: (Escribe la ruta)");
		String directorio = entrada.nextLine();
		File carpeta = new File(directorio);
		
		boolean existe = existeDirectorio(carpeta);
		if (existe == true) {
			System.out.println("Como quieres llamar al fichero?: ");
			String nombreFichero = entrada.nextLine();
			File nuevoFichero = new File(carpeta, nombreFichero);
			if (existeFichero(nuevoFichero)) {
				System.out.println("El fichero ya existia." + nuevoFichero.getAbsolutePath());
				nuevoFichero.setReadable(true);
				nuevoFichero.setWritable(false);
				nuevoFichero.setExecutable(false);
				System.out.println("Los permisos han cambiado a solo lectura.");
			}else {
				try {
					if (nuevoFichero.createNewFile()) {
						System.out.println("Fichero creado: " + nuevoFichero.getAbsolutePath());
					}
				}catch(IOException e) {
					System.out.println("Error al crear el fichero.");
					e.getMessage();
				}
			}
		}else {
			System.out.println("El directorio no existe");
		}
		
	}
	public static boolean existeDirectorio(File carpeta) {
		boolean existe = false;
		if (carpeta.exists()) {
			existe = true;
		}
		return existe;
	}
	public static boolean existeFichero(File fichero) {
		return fichero.exists() && fichero.isFile();
	}
	
}
