package EncuestaConcurrencia;

public class Hilo implements Runnable {
	String zona;
	ResultadosEncuesta resultados;
	int numVotantes;

	public Hilo(String zona, int numVotantes, ResultadosEncuesta resultados) {
		super();
		this.zona = zona;
		this.numVotantes = numVotantes;
		this.resultados = resultados;
	}

	@Override
	public void run() {
		int pp = 0, vox = 0, pesoe = 0, nulos = 0, totalVotos = 0;
		for (int i = 0; i < numVotantes; i++) {
			int voto = (int) (Math.random() * 4);
			if (voto == 0) {
				this.resultados.incementarVotos();
				pp++;
				totalVotos++;
			} else if (voto == 1) {
				this.resultados.incementarVotos();
				vox++;
				totalVotos++;
			} else if (voto == 2) {
				this.resultados.incementarVotos();
				pesoe++;
				totalVotos++;
			} else {
				this.resultados.incementarVotos();
				nulos++;
				totalVotos++;
			}
		}
		System.out.printf("Zona %s -> PP: %d, VOX: %d, PESOE: %d, Nulos: %d --> Votos totales en la zona %s: %d\n", zona, pp, vox, pesoe, nulos, zona, totalVotos);
	}

}
