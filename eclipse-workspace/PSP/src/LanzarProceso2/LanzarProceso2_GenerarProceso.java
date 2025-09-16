package LanzarProceso2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LanzarProceso2_GenerarProceso {
	public static void ejecutar(String rutadirectorio, String nombreEjecutable) {
		List <String> nombreArgumentos = new ArrayList(); 
		File directorio = new File(rutadirectorio);
		nombreArgumentos.add(nombreEjecutable);// EXAMPLE OF A PROGRAM PATH
		ProcessBuilder pb = new ProcessBuilder(nombreArgumentos);
		pb.command(nombreEjecutable); // COMAND IS THE NAME OF THE EXECUTABLE
		pb.directory(directorio); // DIRECTORY IS THE PATH AS OBJET OF FILE CLASS
		// ES LO MISMO QUE EL ANTERIOR SOLO QUE DIVIDES LA RUTA PARA QUE SI EN UN
		// DIRECTORIO HAY VARIOS EJECUTABLES PUES ELIGES CUAL ES EL QUE QUIERES 
		// EJECUTAR.
		try {
			//Process proceso = pb.start(); es lo mismo que pb.start();
			pb.start();
		}catch(Exception e) { // La minima excepcion que podemos tratar, engloba a todas las excepciones.
			e.printStackTrace(); // Con esto sacamos la traza del error, también podemos poner nosotros un mensaje
		}
	}
}
