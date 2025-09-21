package ejerciciosDeLectura_SegundaTarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class leerFicheroDeTexto {

	public static void main(String[] args) {
		File ficheroAleer = new File("C:/Users/DAM/Downloads/pepe.txt");
		try {
			FileReader lector =new FileReader(ficheroAleer);
			BufferedReader buffer = new BufferedReader(lector);
			String linea = buffer.readLine().replaceAll(" ", "");
			while(linea != null ) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
			
		}catch(IOException e) {
			e.getMessage();
		}
	}
}
