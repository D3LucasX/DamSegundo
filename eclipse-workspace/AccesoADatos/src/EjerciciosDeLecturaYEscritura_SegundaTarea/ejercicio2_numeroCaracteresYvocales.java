package EjerciciosDeLecturaYEscritura_SegundaTarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ejercicio2_numeroCaracteresYvocales {

	public static void main(String[] args) {
		String regex = "[aeiouAEIOU]";
		String LineaSinEspacios;
		int cantidadVocales = 0; //C:/Users/DAM/Downloads/pepe.txt
		File ficheroAleer = new File("C:/Users/d3luc/Downloads/PEPE.txt");
		try {
			FileReader lector =new FileReader(ficheroAleer);
			BufferedReader buffer = new BufferedReader(lector);
			String linea;
			Pattern pattern = Pattern.compile(regex);
			
			while((linea = buffer.readLine()) != null ) {
				LineaSinEspacios = linea.replaceAll(" ", "");
				System.out.println(LineaSinEspacios);
				Matcher matcher = pattern.matcher(LineaSinEspacios);
				while (matcher.find()) {
					cantidadVocales++;
				}
			}
			System.out.println("Cantidad de vocales = " + cantidadVocales);
			
		}catch(IOException e) {
			e.getMessage();
		}
	}
}
