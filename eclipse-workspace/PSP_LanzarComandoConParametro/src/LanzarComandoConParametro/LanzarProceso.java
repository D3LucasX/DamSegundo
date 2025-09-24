package LanzarComandoConParametro;

public class LanzarProceso {

	public static void main(String[] args) {
		String ruta = "ipconfig";
		String[] parametros = {"/all"}; // Añadimos array de strings para meter todos los parámetros que queramos
		LanzarComando lanzador = new LanzarComando();
			lanzador.ejecutar(ruta, parametros); 
			System.out.println("Proceso ejecutado!!!");

	}

}
