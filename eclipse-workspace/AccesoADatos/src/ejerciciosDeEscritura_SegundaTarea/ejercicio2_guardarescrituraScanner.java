package ejerciciosDeEscritura_SegundaTarea;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio2_guardarescrituraScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		File carpeta = new File("C:/Users/d3luc/Downloads");
		File nuevoFichero = new File(carpeta,"registroDeUsuario");
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoFichero))){
			System.out.println("Escribe lo que quieras... (Escribe fin para terminar)");
			String frase = entrada.nextLine();
			while(!frase.equalsIgnoreCase("fin")) {
				writer.write(frase);
				writer.newLine();
				frase = entrada.nextLine();
			}
			writer.close();
			System.out.println("Archivo modificado correctamente. (ruta: " + nuevoFichero.getAbsolutePath() + " )");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
