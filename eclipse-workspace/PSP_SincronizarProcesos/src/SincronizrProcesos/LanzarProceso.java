package SincronizrProcesos;

public class LanzarProceso {

	public static void main(String[] args) {
		GenerarProceso lanzador = new GenerarProceso();
		String ruta = "cmd.exe";
		String [] argumentos = {
				"/C",
				"start"
		};
			lanzador.ejecutar(ruta, argumentos); 
			System.out.println("Proceso ejecutado!!!");
	}

}
