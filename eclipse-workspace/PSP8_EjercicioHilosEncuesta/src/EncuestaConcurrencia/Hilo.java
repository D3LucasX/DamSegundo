package EncuestaConcurrencia;

public class Hilo implements Runnable {
	int nombreZona;
	int num_votantes;
	ResultadosEncuesta resultados;

	public Hilo(String nombreZona,int num_votantes, ResultadosEncuesta resultados) {
		
		super();
		this.nombreZona = (int) (Math.random() * 4);
		this.num_votantes = num_votantes;
		this.resultados = resultados;
	}

	@Override
	public void run() {
		int votos
		if (zona == 0) {
			nombreZona = "Norte";
			num_votantes = 300;
		} else if (zona == 1) {
			nombreZona = "Sur";
			num_votantes = 400;
		} else if (zona == 2) {
			nombreZona = "Este";
			num_votantes = 500;
		} else if (zona == 3) {
			nombreZona = "Oeste";
			num_votantes = 350;
		}

		if (esVoto == 1) {
			this.resultados.incementarVotos();
			votoPositivo++;
			this.votosXzona++;

			if (zona == 0) {
				if (partido == 0) {
					nombrePartido="PP";
					votoPPposi++;
				} else if (partido == 1) {
					nombrePartido = "PESOE";
					votoPesoeposi++;
				} else if (partido == 2) {
					nombrePartido = "VOX";
					votoVoxposi++;
				} else if (partido == 3) {
					nombrePartido = "Sumar";
					votoSumarposi++;
				}
			} else if (zona == 1) {
				if (partido == 0) {
					nombrePartido="PP";
					votoPPposi++;
				} else if (partido == 1) {
					nombrePartido = "PESOE";
					votoPesoeposi++;
				} else if (partido == 2) {
					nombrePartido = "VOX";
					votoVoxposi++;
				} else if (partido == 3) {
					nombrePartido = "Sumar";
					votoSumarposi++;
				}
			} else if (zona == 2) {
				if (partido == 0) {
					nombrePartido="PP";
					votoPPposi++;
				} else if (partido == 1) {
					nombrePartido = "PESOE";
					votoPesoeposi++;
				} else if (partido == 2) {
					nombrePartido = "VOX";
					votoVoxposi++;
				} else if (partido == 3) {
					nombrePartido = "Sumar";
					votoSumarposi++;
				}
			} else if (zona == 3) {
				if (partido == 0) {
					nombrePartido="PP";
					votoPPposi++;
				} else if (partido == 1) {
					nombrePartido = "PESOE";
					votoPesoeposi++;
				} else if (partido == 2) {
					nombrePartido = "VOX";
					votoVoxposi++;
				} else if (partido == 3) {
					nombrePartido = "Sumar";
					votoSumarposi++;
				}
			}

		} else if (esVoto == 2) {
			this.resultados.incementarVotos();
			votosXzona++;
			votoNulo++;
			if (zona == 0) {
				if (partido == 0) {
					nombrePartido="PP";
					votoPPnega++;
				} else if (partido == 1) {
					nombrePartido = "PESOE";
					votoPesoenega++;
				} else if (partido == 2) {
					nombrePartido = "VOX";
					votoVoxnega++;
				} else if (partido == 3) {
					nombrePartido = "Sumar";
					votoSumarnega++;
				}
			}else if (zona == 1) {
				if (partido == 0) {
					nombrePartido="PP";
					votoPPnega++;
				} else if (partido == 1) {
					nombrePartido = "PESOE";
					votoPesoenega++;
				} else if (partido == 2) {
					nombrePartido = "VOX";
					votoVoxnega++;
				} else if (partido == 3) {
					nombrePartido = "Sumar";
					votoSumarnega++;
				}
			}else if (zona == 2) {
				if (partido == 0) {
					nombrePartido="PP";
					votoPPnega++;
				} else if (partido == 1) {
					nombrePartido = "PESOE";
					votoPesoenega++;
				} else if (partido == 2) {
					nombrePartido = "VOX";
					votoVoxnega++;
				} else if (partido == 3) {
					nombrePartido = "Sumar";
					votoSumarnega++;
				}
			}else if (zona == 3) {
				if (partido == 0) {
					nombrePartido="PP";
					votoPPnega++;
				} else if (partido == 1) {
					nombrePartido = "PESOE";
					votoPesoenega++;
				} else if (partido == 2) {
					nombrePartido = "VOX";
					votoVoxnega++;
				} else if (partido == 3) {
					nombrePartido = "Sumar";
					votoSumarnega++;
				}
			}
		}else {
			votoNulo++;
		}
		System.out.printf("Resumen de votacion en la zona %s:\n", nombreZona
				+ "\t %s; ", nombrePartido
				+ "\t\t Votos a favor: %d."
				+ "\t\t Votos en contra: %d."
				+ "");
	}

}
