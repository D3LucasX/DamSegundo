package lanzarComandoPSP;

public class LanzarProceso {

	public static void main(String[] args) {
		String ruta = "ipconfig";
		GeneradorProceso lanzador = new GeneradorProceso();
		lanzador.ejecutar(ruta);

	}

}
