package LanzarProceso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneradorProceso {
		public static void ejecutar(String ruta, String [] args) {
			if (ruta == null || ruta.isEmpty()) {
				System.out.println("Falta elnombre del comando");
				System.exit(1);
			}
			
			
			List<String> comando = new ArrayList<>();
			comando.add(ruta);
			// Comprobamos que la lista comando existe
			if(comando != null) {
				// Convertimos el array en una lista de Strings para poder usar el metodo addAll
				comando.addAll(Arrays.asList(args));
			}
			
			ProcessBuilder pb = new ProcessBuilder(comando);
			
			try {
				Process proceso = pb.start(); //es lo mismo que pb.start();
				
				
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("CMD de Windows lanzado en una nueva ventana");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				
		
			}catch(IOException ioe) { // La minima excepcion que podemos tratar, engloba a todas las excepciones.
				System.out.println("Error durante la ejecución del programa");
				ioe.printStackTrace(); // Con esto sacamos la traza del error, también podemos poner nosotros un mensaje
			}
		}
	}




