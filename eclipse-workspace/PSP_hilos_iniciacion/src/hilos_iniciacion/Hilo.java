package hilos_iniciacion;

public class Hilo implements Runnable {
	private final String nombre;

	Hilo(String nombre) {
		this.nombre = nombre;

	}

	@Override
	public void run() {
		System.out.printf("Hola, soy un hilo %s. \n", this.nombre);
		System.out.print("Hilo terminado. \n");
	}

}
