package EncuestaConcurrencia;

public class ResultadosEncuesta {
private int resultado = 0;


	synchronized public int getcuenta() {
	return this.resultado;
	}
	synchronized public int incementarVotos() {
		resultado++;
		return resultado;
	}
}
