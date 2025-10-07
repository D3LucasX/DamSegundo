package HilosCooperando;

public class Contador {
private int cuenta = 0;
	
// Al poner el synchronized en el metodo, estas indicando que solo puede haber un hilo a la vez.
	synchronized public int getCuenta() {
		return cuenta;
	}
	
	synchronized public int incremento() {
		this.cuenta++;
		return cuenta;
	}
}
