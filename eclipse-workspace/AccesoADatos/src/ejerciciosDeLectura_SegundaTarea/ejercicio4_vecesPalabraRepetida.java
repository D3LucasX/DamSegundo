package ejerciciosDeLectura_SegundaTarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ejercicio4_vecesPalabraRepetida {

	public static void main(String[] args) {
		File ficheroAleer = new File("C:/Users/DAM/Downloads/frutas(1).txt");
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(ficheroAleer));
			// Creamos un HasMap para contar las repeticiones
			Map<String, Integer> contador = new HashMap<>();
			String linea = "";
			linea = linea.toLowerCase();
			
			while ((linea= buffer.readLine()) != null) {
				//  para separar las palabras usamos \\s+ que es cualquier caracter de espacio
				// en blanco, incluidos los saltos de linea, y el mas es uno o mas
				
				String[] palabras = linea.split("\\s+"); 
				
				// Recorre el array y cuenta cada palabra
				// .getOrDefault(palabra, 0) + 1 --> busca la palabra, si esta, 
					// devuelve 0 + 1 = 1, si la vuelve a encontrar, devuelve 1 + 1 = 2 y asi. 
				
				// contador.put(palabra, contador) --> añade el resultado del contador por palabra
				for (String palabra : palabras) {
					contador.put(palabra,contador.getOrDefault(palabra, 0) + 1);
				}
			}
			
			// Muestra el resultado
			// Map.Entry<String, Integer> entry --> Entry es una interfaz 
				//dentro de map, estamos diciendo que sera una variable que 
				// contiene un par <clave.valor>
			//contador.entrySet() --> metodo de Map, ya que contador es de tipo
				// Map, que devuelve un set de todas las entradas del mapa(Set<Map.Entry<k,v>>)
			for (Map.Entry<String, Integer> entry : contador.entrySet()) {
				int repeticiones = entry.getValue();
				if (repeticiones == 1) {
					repeticiones = 0;
				}else {
					repeticiones = repeticiones -1;
				}
				System.out.println(entry.getKey() + " -> " + repeticiones);
			}
			
		}catch(IOException ioe) {
			ioe.getMessage();
		}
	}

}
