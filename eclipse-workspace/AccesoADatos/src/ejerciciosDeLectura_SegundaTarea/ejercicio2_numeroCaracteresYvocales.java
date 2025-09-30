package ejerciciosDeLectura_SegundaTarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ejercicio2_numeroCaracteresYvocales {

	public static void main(String[] args) {
		String letra = "";
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		String regex = "[aeiou]";
		String LineaSinEspacios;
		int cantidadVocales = 0; 	//C:/Users/DAM/Downloads/pepe.txt
		File ficheroAleer = new File("C:/Users/DAM/Downloads/pepe.txt");
		
		try {
			FileReader lector =new FileReader(ficheroAleer);
			BufferedReader buffer = new BufferedReader(lector);
			String linea;
			Pattern pattern = Pattern.compile(regex);
			
			while((linea = buffer.readLine()) != null ) {
				LineaSinEspacios = linea.replaceAll(" ", "").toLowerCase();
				System.out.println(LineaSinEspacios);
				Matcher matcher = pattern.matcher(LineaSinEspacios);
				while (matcher.find()) {
					cantidadVocales++;
					letra = matcher.group();
					if(letra.equals("a")) {a++;}
					if(letra.equals("e")) {e++;}
					if(letra.equals("i")) {i++;}
					if(letra.equals("o")) {o++;}
					if(letra.equals("u")) {u++;}
				}
			}
			System.out.println("Cantidad de vocales = " + cantidadVocales);
			System.out.println("La cantidad de 'a' = " + a);
			System.out.println("La cantidad de 'e' = " + e);
			System.out.println("La cantidad de 'i' = " + i);
			System.out.println("La cantidad de 'o' = " + o);
			System.out.println("La cantidad de 'u' = " + u);
			
		}catch(IOException ioe) {
			ioe.getMessage();
		}
	}
}
