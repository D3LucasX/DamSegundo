package hilos_join_sleep;

import java.util.Random;

public class Hilo implements Runnable {
	private final String nombre;

	Hilo(String nombreEntr) {
		this.nombre = nombreEntr;

	}

	@Override
	public void run() {
		// En el Syso se pone el this cuando hay ambigüedad
		System.out.printf("Hola soy el hilo %s .\n", nombre);
		for (int i = 0; i < 5; i++) {
			Random r = new Random();
			int pausa = 20 + r.nextInt(500 - 20);
			System.out.printf("Hilo %s hace pausa de %d ms. \n", nombre, pausa);

			try {
				Thread.sleep(pausa);
			} catch (InterruptedException e) {
				System.out.printf("hilo %s interrumpido. \n", nombre);
				e.printStackTrace();
			}
		}
		System.out.printf("Hilo %s ha terminado. \n", nombre);
	}
}
