package SincronizrProcesos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerarProceso {
	public static void ejecutar(String ruta, String[] args) {
		Process proceso = null;
		List <String> nombreArgumentos = new ArrayList(); 
		if (ruta == null || ruta.isEmpty()) {
			System.out.println("Falta elnombre del comando");
			System.exit(1);
		}
		File directorio = new File(ruta);
		
		nombreArgumentos.add(ruta);// EXAMPLE OF A PROGRAM PATH
		for (int i= 0; i < args.length; i++) { // PASAMOS UNA LISTA CON LOS PARAMETROS QUE QUERAMOS Y LOS METERA TODOS CON EL BUCLE
			nombreArgumentos.add(args[i]);
		}
		ProcessBuilder pb = new ProcessBuilder(nombreArgumentos); //Clase que permite generar procesos
		
		pb.command(nombreArgumentos); // COMAND IS THE NAME OF THE EXECUTABLE
		// Esto hace que el proceso herede la entrada salida estandar del proceso padre. Así podemos ver el resulado del comando.
		//(ipconfig en este caso)
		pb.inheritIO();
		
		try {
			proceso = pb.start(); //es lo mismo que pb.start();
			System.out.println("Se ha lanzado el proceso.");
			System.out.println("El proceso padre esperara a que el hijo termine su ejecucion.");
	
				proceso.waitFor();
				System.out.println("El proceso hijo termino.");
				
		}catch(InterruptedException ioe) {
				ioe.printStackTrace();
		}catch(IOException e ) {
				e.printStackTrace();
		}
	
}
}
