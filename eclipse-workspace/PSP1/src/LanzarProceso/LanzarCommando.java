package LanzarProceso;

import java.util.ArrayList;
import java.util.List;

public class LanzarCommando {

	public static void main(String[] args) {
		
		GeneradorProceso lanzador = new GeneradorProceso();
		String ruta = "cmd.exe";
		String [] argumentos = {
				"/C",
				"start"
		};
			lanzador.ejecutar(ruta, argumentos); 
			System.out.println("Proceso ejecutado!!!");
	}

	}

