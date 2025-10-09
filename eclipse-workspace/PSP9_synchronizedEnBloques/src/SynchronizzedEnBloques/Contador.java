package SynchronizzedEnBloques;

public class Contador {
	private long cont1 = 0;
	private long cont2 = 0;

	private final Object lock1 = new Object(); // Creamos un objeto de la clase contador para que podamos encapsular
	private final Object lock2 = new Object(); // La parte de codigo que queramos con el synchronized.

	public void incrementar1() {
		synchronized (lock1) {
			cont1++;
		}
	}

	public void incrementar2() {
		synchronized (lock2) {
			cont2++;
		}
	}

	public long getContador1() {
		synchronized (lock1) {
			return cont1;
		}
	}

	public long getContador2() {
		synchronized (lock2) {
			return cont2;
		}
	}
}
