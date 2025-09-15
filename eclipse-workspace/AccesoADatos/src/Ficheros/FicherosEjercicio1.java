package Ficheros;
import java.io.*;
public class FicherosEjercicio1 {

	public static void main(String[] args) {
		
		// dentro de los parentesis ponemos la ruta del archivo
		File fichero = new File("ficheroEjemplo.txt");
		
		// Some File class methods
		if (fichero.exists()) {
			
			System.out.println("nombre del fichero --> " + fichero.getName());
			System.out.println("Ruta --> " + fichero.getPath());
			System.out.println("Ruta absoluta --> " + fichero.getAbsolutePath());
			System.out.println("Tenemos permiso de ejecucion --> " + fichero.canExecute());
			System.out.println("Tenemos permiso de lectura --> " + fichero.canRead());
			System.out.println("Tenemos permiso de escribir --> " + fichero.canWrite());
			System.out.println("Tamaño --> " + fichero.length());
			
			
			try {
				// Se tiene que meter en un try catch para por que todas las lecturas o escrituras de disco generan excepciones y se 
				//puede romper el programa
				
				// Devuelve caracter a caracter
				FileReader lector =new FileReader(fichero);
				// Lleno el buffer de los caracteres y leo las lineas
				BufferedReader buffer = new BufferedReader(lector);
				String linea;
				// Lee linea por linea hasta que no haya nada. == NULL
				while((linea =buffer.readLine()) != null ) {
					System.out.println(linea);
				}
				
			}catch(IOException e) {
				e.getMessage();
			}
			
		}else {
			
			System.out.println("No existe el fichero");
			
			// El try catch se utiliza cuando hay escrituras en el disco.
			try{
				fichero.createNewFile();
				System.out.println("Fichero creado correctamente.");
				
			}catch(IOException io) {
				io.printStackTrace();
			}
		}
	}

}
