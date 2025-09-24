package ComunicacionProcesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneradorProceso {
	public void ejecutar (String ruta) {
		String line;
		Runtime rt = Runtime.getRuntime();
		// Con esto creas el proceso sin el processBuilder, pero
		// el ProcessBuilder está mas optimizado, a veces solo con
		// el Runtime nos valdría. El que mas se usa es el Runtime
		// por que lleva mas tiempo.
		Process proceso = null;
		try {
			// Proceso hijo, El padre es la
			// Linea de ejecución de mi programa
			proceso = rt.exec(ruta); 
			
			
			// InputStramReader es una clase que necesitamos para
			// poder leer la entrada del proceso hijo. La cual
			// usamos su metodo getInputStream() para leer el proceso
			// Se usa siempre que quieras leer de algo.
			BufferedReader buffer = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		if (proceso != null) {
			proceso.destroy();
		}
		try {
			proceso.waitFor();
		}catch(InterruptedException ie) {
			System.exit(2);
		}
		System.exit(0);
	}
}
