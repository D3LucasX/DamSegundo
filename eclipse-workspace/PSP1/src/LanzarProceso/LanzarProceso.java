package LanzarProceso;

public class LanzarProceso {

	public static void main(String[] args) {
		String ruta = "ruta alnotepad";
		String nombre = "notepad.exe";
		GeneradorProceso lanzador = new GeneradorProceso();
			lanzador.ejecutar(ruta,nombre); // me coge el generar proceso, y no el generar proceso 2
			System.out.println("Proceso ejecutado!!!");
	}

	}

