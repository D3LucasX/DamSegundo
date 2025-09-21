package ejerciciosDeLectura_SegundaTarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejercicio5_ordenarPalabras {

	public static void main(String[] args) {
		File ficheroAleer = new File("C:/Users/d3luc/Downloads/frutas.txt");
		List<String> palabras = new ArrayList<>();
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(ficheroAleer));
			String linea;
			while ((linea = buffer.readLine()) != null) {
				//  para separar las palabras usamos \\s+ que es cualquier caracter de espacio
				// en clanco, incluidos los saltos de linea, y el mas es uno o mas
				
				String[] partes = linea.split("\\s+"); 
				
				
				// Recorre el array y cuenta cada palabra
				// .getOrDefault(palabra, 0) + 1 --> busca la palabra, si esta, 
					// devuelve 0 + 1 = 1, si la vuelve a encontrar, devuelve 1 + 1 = 2 y asi. 
				
				// contador.put(palabra, contador) --> añade el resultado del contador por palabra
				for (String palabra :  partes) {
					palabras.add(palabra);
				}
			}
		}catch(IOException ioe) {
			ioe.getMessage();
		}
		
		// Ordenar palabras
		// Collections, clase con metodos estáticos para trabajar con colecciones
		// como por ejemplo ordenar, darle la vuelta a una lista, etc...
		Collections.sort(palabras);
		
		// Mostrar resultado
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
	}

}
