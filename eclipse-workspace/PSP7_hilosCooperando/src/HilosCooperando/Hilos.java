package HilosCooperando;

public class Hilos implements Runnable{
	// miCuenta va a ser las veces que se ejecuta cada hilo.
	int numHilo, miParte, miCuenta;
	private final Contador cont;

	Hilos(int numHilo, int miParte, Contador c){
		this.numHilo = numHilo;
		this.miParte = miParte;
		this.cont = c;
	}
	
	public int getMiCuenta() {
		return miCuenta;
	}
	@Override
	public void run() {
		for(int i = 0; i < miParte; i++) {
			// Incremento el contador compartido.
			this.cont.incremento();
			// Incremento el contador de las veces que me ejecuto
			this.miCuenta++;
		}
		System.out.printf("Hilo %d terminado, cuenta %s\n", numHilo, getMiCuenta());
	}

}
