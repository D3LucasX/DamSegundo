package EncuestaConcurrencia;

public class Hilo implements Runnable{
	int numVotantes;
	int zona;
	int partido;
	int voto;
	int votosXzona = 0;
	ResultadosEncuesta resultados;
	

	public Hilo(String zona, int numVotantes, int voto, int partido) {
		super();
		this.zona = ((int) Math.random()*4);
		this.numVotantes = numVotantes;
		this.voto = ((int) Math.random()*2);
		this.partido = ((int) Math.random()*4);
	}


	@Override
	public void run() {
		String nombreZona = "";
		if (zona == 0) {
			nombreZona = "Norte";
		}else if (zona == 1) {
			nombreZona = "Sur";
		}else if (zona == 2) {
			nombreZona = "Este";
		}else if (zona == 3) {
			nombreZona = "Oeste";
		}
		
		if (voto == 1) {
			this.resultados.incementarVotos();
			this.votosXzona++;
		}
		System.out.println("Votos recolectados en esta zona.");
	}

}
