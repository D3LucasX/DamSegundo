package LanzarProcesoDesdeCodigo;

public class Principal {

	public static void main(String[] args) {
		
		GeneradorProceso lanzador = new GeneradorProceso();
		lanzador.ejecutar();
		System.out.println("Proceso ejecutado!!!");
	}

}
