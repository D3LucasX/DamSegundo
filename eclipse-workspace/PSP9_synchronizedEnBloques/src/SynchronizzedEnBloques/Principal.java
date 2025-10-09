package SynchronizzedEnBloques;

public class Principal {

	public static void main(String[] args) {
		Thread[] hiloNuevo = new Thread[10];
		Contador contador = new Contador();
		
		for (int i = 0; i < 10; i++) {
			Thread nuevoHilo = new Thread(new Hilo(contador));
			nuevoHilo.start();
			hiloNuevo[i] = nuevoHilo;
		}
		for(Thread h: hiloNuevo) {
			try {
				h.join();
			}catch(InterruptedException ioe ) {
				ioe.printStackTrace();
			}
		}
		System.out.printf("\nEl número total del primer contador es: %d", contador.getContador1());
		System.out.printf("\nEl número total del segundo contador es: %d", contador.getContador2());
		System.out.println("\nEL prograsma ha finalizado");
	}

}
