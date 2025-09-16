package manejoDeFicheros_PrimeraTarea;

import java.io.*;
import java.util.Scanner;

public class Ejercicios01_01Ficheros_EJ1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime de que directorio quieres listar los elementos: ");
		String directorio = entrada.nextLine();
		File fichero = new File(directorio);
		
		if(fichero.exists()) {
		
				String[] arrayElementos = fichero.list();
				for (int i = 0; i < arrayElementos.length; i++) {
					System.out.println(arrayElementos[i]);
				}
		}else {
				fichero.mkdir();
				System.out.println("No existia ese directorio, lo hemos creado correctamente.");
		
		}
	}

}
