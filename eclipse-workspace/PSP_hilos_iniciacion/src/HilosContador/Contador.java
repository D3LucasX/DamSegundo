package HilosContador;

public class Contador {
	private int cuenta = 0;
	
	public int getCuenta() {
		return cuenta;
	}
	public int incremento() {
		this.cuenta++;
		return cuenta;
	}
}
