package SynchronizzedEnBloques;

public class Hilo implements Runnable{
	int contadorPropio1 = 0;
	int contadorPropio2 = 0;
	Contador contadorGeneral;

	public Hilo(Contador contadorGeneral) {
		super();
		this.contadorGeneral = contadorGeneral;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			contadorGeneral.incrementar1();
			contadorPropio1++;
		}
		for (int i = 0; i < 10000; i++) {
			contadorGeneral.incrementar2();
			contadorPropio2++;
		}
		System.out.printf("\nContador propio 1 = %d", contadorPropio1);
		System.out.printf("\nContador propio 2 = %d", contadorPropio2);
		
	}
}
