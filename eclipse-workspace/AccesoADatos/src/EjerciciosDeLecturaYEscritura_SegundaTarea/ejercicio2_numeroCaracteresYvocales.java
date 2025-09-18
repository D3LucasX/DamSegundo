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
		int cantidadVocales = 0;
		File ficheroAleer = new File("C:/Users/DAM/Downloads/pepe.txt");
		try {
			FileReader lector =new FileReader(ficheroAleer);
			BufferedReader buffer = new BufferedReader(lector);
			String linea;
			
			while((linea = buffer.readLine()) != null ) {
				LineaSinEspacios = linea.replaceAll(" ", "");
				System.out.println(LineaSinEspacios);
				linea = buffer.readLine();
			}
			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(linea);
			while (matcher.find()) {
				cantidadVocales++;
				
			}
		}catch(IOException e) {
			e.getMessage();
		}
	}
}
