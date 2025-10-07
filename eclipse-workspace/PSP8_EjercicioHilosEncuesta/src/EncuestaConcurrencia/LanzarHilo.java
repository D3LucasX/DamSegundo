package EncuestaConcurrencia;


public class LanzarHilo {
	
	private static final int TOTAL_ZONAS = 5;
	private static final int TOTAL_VOTANTES = 500;
	
	public static void main (String[]args) {
		ResultadosEncuesta Resultado = new ResultadosEncuesta();
		Thread [] ArrayHilos = new Thread[TOTAL_ZONAS];
		
		for (int i = 0; i < TOTAL_ZONAS ; i++) {
			Thread hilonuevo = new Thread(new Hilos());
			hilonuevo.start();
			ArrayHilos[i] = hilonuevo;
		}
	}
}
