package EncuestaConcurrencia;


public class LanzarHilo {
	
	private static final int TOTAL_ZONAS = 4;
	
	public static void main (String[]args) {
		String zona = "";
		int numVotantes = 200;
		ResultadosEncuesta Resultado = new ResultadosEncuesta();
		Thread [] ArrayHilos = new Thread[TOTAL_ZONAS];
		for (int i = 0; i < TOTAL_ZONAS; i++) {
			int numZona = (int) (Math.random() * 4);
			
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
			
			numVotantes = (int) (Math.random() * 400 );
			Thread hiloNuevo = new Thread(new Hilo(zona, numVotantes));
			hiloNuevo.start();
			ArrayHilos[i] = hiloNuevo;
		}
		for (Thread h: ArrayHilos){
			try {
				h.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
