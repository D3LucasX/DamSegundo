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
/* Scanner entrada = new Scanner(System.in);
 * System.out.println("Que directorio quieres buscar?: (Escribe la ruta) ");
 * String directorio = entrada.nextLine();
 * File directorio = new File(nombreDelFichero)
 * if (directorio.exists() && directorio.eiDirectory()){
 * 		listar(directorio);
 * }else{
 * 		Syso("No es un directorio")
 * }
 * 
 *	// Funcion recursiva.
 * public static void listar (File directorio){
 * 		if (directorio.exists() && directorio.isDirectory()){
 * 			String [] listarArchivos = directorio.list();
 * 			for (String archivo : listarArchivos){
 * 				// creamos una instancia de File para que cuando aparezca un directorio podamos lstar sus archivos otra vez
 * 				// es decir, para poder usar de nuevo el .list()
 * 				File a = new File(directorio, archivo);
 * 						
 * 				
 * 				if (archivo != null){  // Se vuelve a llamar a la funcion con la nueva carpeta para listar los elementos CASO RECURSIVO
 * 					listar(a);
 * 				}	
 * 				Syso(a.getAbsolutePah()) // Si es un fichero lo imprime CASO BASE
 * 			}
  * 	}
 * }
 */
