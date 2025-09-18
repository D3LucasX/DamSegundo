package lanzarComandoPSP;

import java.util.ArrayList;
import java.util.List;

public class GeneradorProceso {
	
	public void ejecutar(String ruta) {
		List <String> nombreArgumentos = new  ArrayList<>();
		nombreArgumentos.add(ruta);
		ProcessBuilder pb = new ProcessBuilder(); 
		pb.command(nombreArgumentos);
	}
}
