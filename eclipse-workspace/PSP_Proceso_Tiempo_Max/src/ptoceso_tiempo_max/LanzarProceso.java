package ptoceso_tiempo_max;


public class LanzarProceso {
	public static void main(String[] args) {
		String ruta = "cmd.exe";
		String[] parametros = {
				"/c",
				"dir"
		}; // Añadimos array de strings para meter todos los parámetros que queramos
		generarProceso lanzador = new generarProceso();
			lanzador.ejecutar(ruta, parametros); 
			System.out.println("Proceso ejecutado!!!");

	}
}