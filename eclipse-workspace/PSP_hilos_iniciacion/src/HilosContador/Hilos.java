package HilosContador;

public class Hilos implements Runnable{
	// miCuenta va a ser las veces que se ejecuta cada hilo.
	
	int numHilo, miParte, miCuenta;
	private final Contador cont;

	Hilos(int numHilo, int miParte, Contador c){
		this.numHilo = numHilo;
		this.miParte = miParte;
		this.cont = c;
	}
	
	@Override
	public void run() {
		
	}

}
