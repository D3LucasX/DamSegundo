package Interbloqueo;

public class Principal {
	public static void main (String[]args) {
		Cuenta c1 = new Cuenta("ES2309099090", 23000);
		Cuenta c2 = new Cuenta("ES2309099660", 27000);
		System.out.printf("Saldo inicial de %s %d\n", c1.getCuenta(), c1.getSaldo());
		System.out.printf("Saldo inicial de %s %d\n", c2.getCuenta(), c2.getSaldo());
		System.out.println("----------------------------------------");
		Thread h1 = new Thread(new Hilo (c1,c2,"H1"));
		Thread h2 = new Thread(new Hilo (c2,c1,"H2"));
		
		h1.start();
		h2.start();
		
		try {
			h1.join();
			h2.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.printf("Saldo Final de %s %d\n", c1.getCuenta(), c1.getSaldo());
		System.out.printf("Saldo Final de %s %d\n", c2.getCuenta(), c2.getSaldo());
	}

}
