package EncuestaConcurrencia;

public class LanzarHilo {

	private static final int TOTAL_ZONAS = 4;

	public static void main(String[] args) {
		String zona = "";
		int numVotantes = 0;
		ResultadosEncuesta resultado = new ResultadosEncuesta();
		Thread[] arrayHilos = new Thread[TOTAL_ZONAS];
		for (int i = 0; i < TOTAL_ZONAS; i++) {
			int numZona = i;

			switch (numZona) {
			case 0:
				zona = "Norte";
				break;
			case 1:
				zona = "Sur";
				break;
			case 2:
				zona = "Este";
				break;
			case 3:
				zona = "Oeste";
				break;
			default:
				System.out.println("No se ha podido localizar la zona.");
				break;
			}

			numVotantes = (int) (Math.random() * 400)+200;
				Thread hiloNuevo = new Thread(new Hilo(zona, numVotantes, resultado));
				hiloNuevo.start();
				arrayHilos[i] = hiloNuevo;
		}
		for (Thread h : arrayHilos) {
			try {
				h.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.printf("Los votos totales de todas las zonas son %d", resultado.getTotalVotos());
	}
}
