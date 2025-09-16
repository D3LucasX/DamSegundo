package manejoDeFicheros_PrimeraTarea;

import java.io.File;
import java.util.Scanner;

public class Ejercicios01_01Ficheros_EJ4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que directorio quieres buscar?: (Escribe la ruta) ");
		String directorio = entrada.nextLine();
		
		File carpeta = new File(directorio);
		
		if (carpeta.exists() && carpeta.isDirectory()) {
			String[] arrayElementos = carpeta.list();
			for (int i = 0; i < arrayElementos.length; i++) {
				System.out.println(arrayElementos[i]);
			}
		}else {
			System.out.println("No existe ese directorio.");
		}

	}
}
