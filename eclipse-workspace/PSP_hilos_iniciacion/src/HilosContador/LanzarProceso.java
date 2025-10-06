package HilosContador;

import java.util.ArrayList;

public class LanzarProceso {
	private static final int NUM_HILOS = 10;
	private static final int CUENTA_TOTAL = 100000;
	
	public static void main (String[] args) {
		
		Contador contCompartido = new Contador();
		Thread [] ArrayHilos = new Thread[NUM_HILOS];
		
		for (int i = 0; i < NUM_HILOS ; i++) {
			Thread hilonuevo = new Thread(new Hilos(i, CUENTA_TOTAL/NUM_HILOS, contCompartido));
			hilonuevo.start();
			ArrayHilos[i] = hilonuevo;
		}
		
		// Por cada hilo hemos bloqueado el hilo de ejecucuón principal
		for (Thread h: ArrayHilos){
			try {
				h.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Cuenta global: %s\n", contCompartido.getCuenta());
	}
}
