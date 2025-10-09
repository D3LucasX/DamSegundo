package SynchronizzedEnBloques;

public class Hilo implements Runnable{
	int contadorPropio = 0;
	Contador contadorGeneral;

	public Hilo(int contadorPropio) {
		super();
		this.contadorPropio = contadorPropio;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			contadorGeneral.incrementar1();
		}
		for (int i = 0; i < 10000; i++) {
			contadorGeneral.incrementar2();
		}
		
	}
	
	

}
