package EncuestaConcurrencia;

public class Hilo implements Runnable{
	String zona;
	ResultadosEncuesta resultados;
	int numVotantes;
	

	public Hilo(String zona, int numVotantes) {
		super();
		this.zona = zona;
		this.numVotantes = numVotantes;
		
	}


	@Override
	public void run() {
		int pp = 0, vox = 0, pesoe = 0, nulos = 0;
		int voto = (int) (Math.random()*3);
		if (voto == 0) {
			this.resultados.incementarVotos();
			pp++;
		}else if (voto == 1){
			this.resultados.incementarVotos();
			vox++;
		}else if (voto == 2) {
			this.resultados.incementarVotos();
			pesoe++;
		}else {
			this.resultados.incementarVotos();
			nulos++;
		}
		System.out.printf("Votos recolectados en esta zona %s:\n", zona
				+ "\t\t PP          : %d", pp
				+ "\t\t VOX         :", vox
				+ "\t\t PESOE       : %d", pesoe
				+ "\t\t Votos nulos :", nulos);
	}

}
