package SincronizrProcesos;

public class LanzarProceso {

	public static void main(String[] args) {
		GenerarProceso lanzador = new GenerarProceso();
		String ruta = "notepad";
		String[] args1 = {"C:/Users/DAM/Downloads/frutas.txt"};
			lanzador.ejecutarYdestruir(ruta, args1); 
			System.out.println("Bloc de notas cerrado con exito!!!!!!!!");
	}

}


/*En resumen: cuando abres la CMD con /C start, te lo abre en una nueva ventana pero termina 
 * el proceso, por lo que no funcionar�a nunca el waitFor()
 * 
 * si lo ejecutamops con /k start, se quedar�a el proceso abierto pero pero start genera
 * otro proceso independiente en una ventana nueva quedando el proceso de la terminal
 * de eclipse y el nuevo de la ventana independiente activos, por lo tanto
 * waitFor no se engancha al proceso de la ventana independiente.
 */
