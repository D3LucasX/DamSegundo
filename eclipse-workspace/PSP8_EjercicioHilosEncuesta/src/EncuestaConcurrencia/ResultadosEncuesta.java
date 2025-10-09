package EncuestaConcurrencia;

public class ResultadosEncuesta {
	private int resultado = 0;
	}

	synchronized public void incementarVotos() {
		resultado++;
	}
}
