package LanzarProceso2;


public class LanzarProceso2_Principal {
	public static void main(String[] args) {
		String ruta = "ipconfig";
		String nombre = "notepad.exe";
		GeneradorProceso lanzador = new GeneradorProceso();
			lanzador.ejecutar(ruta,nombre); // me coge el generar proceso, y no el generar proceso 2
			System.out.println("Proceso ejecutado!!!");
	}
}


