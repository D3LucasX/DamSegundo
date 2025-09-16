package LanzarProcesoDesdeCodigo;

import java.util.ArrayList;
import java.util.List;

public class GeneradorProceso {

	public static void ejecutar() {
		List <String> nombreArgumentos = new ArrayList(); 
		nombreArgumentos.add("C:/MyCode/SumarDosNumeros.exe");// EXAMPLE OF A PROGRAM PATH
		nombreArgumentos.add("18");
		nombreArgumentos.add("28");
		ProcessBuilder pb = new ProcessBuilder();
		try {
			//Process proceso = pb.start(); es lo mismo que pb.start();
			pb.start();
		}catch(Exception e) { // La minima excepcion que podemos tratar, engloba a todas las excepciones.
			e.printStackTrace(); // Con esto sacamos la traza del error, también podemos poner nosotros un mensaje
		}
	}
}
