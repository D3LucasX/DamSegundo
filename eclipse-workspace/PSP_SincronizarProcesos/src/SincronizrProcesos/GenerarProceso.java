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
		pb.inheritIO(); //HEREDAR ENTRADA SALIDA DEL PADRE PARA QUE SE NOS VEA EN LA TERMINAL, PORQUE SI NO SE EJECUTABA Y NO SE VE.
		
		try {
			Process proceso = pb.start(); //es lo mismo que pb.start();
			System.out.println("Se ha lanzado el proceso.");
			System.out.println("El proceso padre esperara a que el hijo termine su ejecucion.");
		}catch(IOException e) {
				e.printStackTrace();
		}
			// Ahora toca obtener el codigo de retorno para saber si se ha ejecutado bien el programa y para ello esperamos a que se 
			// acabe el proceso, por eso debemos de esperar a que acabe con:
			int codigoRetorno = proceso.waitFor();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("El comando devuelve " + codigoRetorno);
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			if (codigoRetorno==0) {
				System.out.println("Ejecucion correcta.");
			}else {
				System.out.println("Ejecucion con errores");
			}
		try {
			proceso.waitFor();
			
		}catch(InterruptedException ioe) { // La minima excepcion que podemos tratar, engloba a todas las excepciones.
			System.out.println("Error durante la ejecución del programa");
			System.out.println("INFORMACION ADICIONAL");
			ioe.printStackTrace(); // Con esto sacamos la traza del error, también podemos poner nosotros un mensaje
			System.exit(2);
			
		
	}
}
