package ejerciciosAccesoDirecto;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class ejercicio2_gestionProductos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		File fichero = new File ("ejercicio2.dat");
		try {
			System.out.println("Cuantos productos quieres meter?: ");
			int cantidadProd = entrada.nextInt();
			entrada.nextLine();
			RandomAccessFile escritor = new RandomAccessFile(fichero, "rw");
			int totalProductos = entrada.nextInt();
			for(int i = 0; i < cantidadProd; i++) {
				System.out.printf("introduce el id del %d º producto\n", i+1);
				int id = entrada.nextInt();
				entrada.nextLine();
				escritor.writeInt(id);
				System.out.println("Introduce la cantidad de stock:");
				int cantidad = entrada.nextInt();
				entrada.nextLine();
				escritor.writeInt(cantidad);
				System.out.println("Introduzca el precio:");
				double precio = entrada.nextDouble();
				escritor.writeDouble(precio);
			}
			escritor.seek(0);
			while(escritor.getFilePointer() < escritor.length()) {
				System.out.println(escritor.readInt());
				System.out.println(escritor.readInt());
				System.out.println(escritor.readDouble());
			}
			escritor.close();
			
		}catch (IOException ioe) {
			ioe.printStackTrace();

		}
	}
}
