package EncuestaConcurrencia;

public class ResultadosEncuesta {
	private int resultado = 0;
	private int votosNegativos;
	private int votosPositivos;
	private int votossNulos;

	synchronized public void incementarVotos() {
		resultado++;
	}

	public synchronized void incrementarPositivos() {
		votosPositivos++;
	}

	public synchronized void incrementarNegativos() {
		votosNegativos++;
	}

	synchronized public int getcuenta() {
		return this.resultado;
	}
}
