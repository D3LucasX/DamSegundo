package ejerciciosDeLectura_SegundaTarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class leerFicheroDeTexto {

	public static void main(String[] args) {
		File ficheroAleer = new File("C:/Users/DAM/Downloads/pepe.txt");
		try {
			// Se podria hacer solo con el FileReader
			/*
			 * try(FileReader fichero  = new FileReader ("FicheroEjemplo.txt")){
			 * 	int caracter
			 * 	while ((caracter=fichero.read() != -1){
			 * 		if (caracter != 32){
			 * 			Syso(caracter);
			 * 		}
			 * 	}
			 * }catch (IOException e){
			 * 		e.printStackTrace();
			 * }
			 */
			
			FileReader lector =new FileReader(ficheroAleer);
			BufferedReader buffer = new BufferedReader(lector);
			String linea = "";
			while((linea = buffer.readLine()) != null ) {
				String lineaSinEspacios= linea.replaceAll(" ", "");
				System.out.println(lineaSinEspacios);
			}
			buffer.close();
			
		}catch(IOException e) {
			e.getMessage();
		}
	}
}
