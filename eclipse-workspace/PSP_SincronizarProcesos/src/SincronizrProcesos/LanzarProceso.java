package SincronizrProcesos;

public class LanzarProceso {

	public static void main(String[] args) {
		GenerarProceso lanzador = new GenerarProceso();
		String ruta = "cmd.exe";
		String [] argumentos = {};
			lanzador.ejecutar(ruta, argumentos); 
			System.out.println("Bloc de notas cerrado con éxito!!!!!!!!");
	}

}


/*En resumen: cuando abres la CMD con /C start, te lo abre en una nueva ventana pero termina 
 * el proceso, por lo que no funcionaría nunca el waitFor()
 * 
 * si lo ejecutamops con /k start, se quedaría el proceso abierto pero pero start genera
 * otro proceso independiente en una ventana nueva quedando el proceso de la terminal
 * de eclipse y el nuevo de la ventana independiente activos, por lo tanto
 * waitFor no se engancha al proceso de la ventana independiente.
 */
