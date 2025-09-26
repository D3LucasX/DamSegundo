package ptoceso_tiempo_max;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class generarProceso {
	public static int MAXTIEMPO = 2000;
	public static void ejecutar(String ruta, String[] parametros) {
		Process proceso = null;
		List <String> nombreArgumentos = new ArrayList(); 
		if (ruta == null || ruta.isEmpty()) {
			System.out.println("Falta elnombre del comando");
			System.exit(1);
		}
		nombreArgumentos.add(ruta);// EXAMPLE OF A PROGRAM PATH
		for(int i = 0; i < parametros.length; i++) {
			nombreArgumentos.add(parametros[i]);
		}
		
		ProcessBuilder pb = new ProcessBuilder(nombreArgumentos); //Clase que permite generar procesos
		//pb.command(nombreArgumentos); --> no hace falta escribirlo porque no tiene mas parámetros
		
		pb.inheritIO();
		try {
			proceso = pb.start(); //es lo mismo que pb.start();
			pb.command(nombreArgumentos);
			System.out.println("Se ha lanzado el proceso.");
			System.out.println("El proceso padre esperara a que el hijo termine su ejecucion.");
			try {
				proceso.waitFor(MAXTIEMPO, TimeUnit.MILLISECONDS);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
				
		}catch(IOException e ) { // excepcion de ficheros
				e.printStackTrace();
			
		}catch(IllegalThreadStateException e) { //Valor de retorno de cerrar
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
