package hilos_iniciacion;

public class LanzaHilos {

	public static void main(String[] args) {

		// Creamos loa hilos
		Thread h1 = new Thread(new Hilo("h1"));
		Thread h2 = new Thread(new Hilo("h2"));

		// Lanzamos los hilos
		h1.start();
		h2.start();

		// Mensaje desde el hilo principal
		System.out.printf("Hilo principal terminado. \n");
	}

}
