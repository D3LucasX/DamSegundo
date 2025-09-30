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
				String[] regex = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				for (int i = 0; i < campos.length && i < regex.length; i++) {
					System.out.println(campos[i] + ": " + regex[i].replace("\"", "").trim());
				}
				System.out.println("------------------------"); // separador entre registros
			}
		}catch(IOException e) {
			e.getMessage();
		}

	}

}
