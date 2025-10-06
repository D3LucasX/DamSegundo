package ejerciciosDeLectura_SegundaTarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio3_campoValor {

	public static void main(String[] args) {
		File ficheroAleer = new File("C:/Users/DAM/Downloads/Restaurants.csv");
		try {
			FileReader lector =new FileReader(ficheroAleer);
			BufferedReader buffer = new BufferedReader(lector);
			String cabecera = buffer.readLine(); // capturamos la primera linea donde se encuentra los titulos de los campos
			String[] campos = cabecera.split(","); // Separamos la cabecera en campos.
			
			String linea;
			while((linea = buffer.readLine()) != null ) {
				
				// Con esta expresion regular, evitamos que divida por comas que hay dentro de un campo, por ejemplo "Alcala de Henares, Madrid"
				// pues que el campo direccion sea alcala de henares, madrid y no
				// campo direccion : Alcala de henares
				// otro campo: madrid
				String[] regex = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");     	// ?   -->   lookahead positivo:
																						// la coma debe estar seguida de algo que cumpla 
																						// esta condición, en este caso, que obvie
				
				for (int i = 0; i < campos.length; i++) {
					System.out.println(campos[i] + ": " + regex[i].trim());
				}
				System.out.println("------------------------"); // separador entre registros
			}
		}catch(IOException e) {
			e.getMessage();
		}

	}
	/*try(BufferedReader buffer1 = new BufferedReader(new FileReader ("C:/Users/DAM/Downloads/Restaurants.csv"))){
		String linea;
		String [] encabezados ;
		linea = buffer1.readLine();
		encabezados = linea.split(",");
		
		while ((linea = buffer1.readLine()) != null) {
			String[] partes = linea.split(",");
			for (int i = 0; i < encabezados.length; i++) {
				System.out.println("-" + encabezados[i] + ": " + partes[i]);
			}
		}
	}*/

}
