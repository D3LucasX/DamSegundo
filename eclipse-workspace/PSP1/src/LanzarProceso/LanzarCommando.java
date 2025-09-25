package LanzarProceso;

import java.util.ArrayList;
import java.util.List;

public class LanzarCommando {

	public static void main(String[] args) {
		
		GeneradorProceso lanzador = new GeneradorProceso();
		String ruta = "C:/Program Files/Google/Chrome/Application/chrome.exe";
		String [] argumentos = {"https://github.com/D3LucasX"};
			lanzador.ejecutar(ruta, argumentos); 
			System.out.println("Proceso ejecutado!!!");
	}

	}

