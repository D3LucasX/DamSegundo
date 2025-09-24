package ComunicacionProcesos;

public class Principal {

	public static void main(String[] args) {
		String ruta = "ping" + " google.es"; // espacio antes de google
		GeneradorProceso lanzador = new GeneradorProceso();
		lanzador.ejecutar(ruta);
		System.out.println("Proceso ejecutado");

	}

}
