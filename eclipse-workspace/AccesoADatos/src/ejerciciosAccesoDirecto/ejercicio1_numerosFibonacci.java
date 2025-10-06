package ejerciciosAccesoDirecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio1_numerosFibonacci {

	public static List<Integer> fibo(int n){
		List<Integer> fibonacci = new ArrayList<>();
		
		int a = 0;
		int temp = 1;
		fibonacci.add(0);
		fibonacci.add(1);
		for (int i = 0; i < n; i++) {
			int fibo = a + temp;
			a = temp;
			temp = fibo;
			fibonacci.add(fibo);
		}
		return fibonacci;
	}
	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		File fichero = new File ("fibo.dat");
		try {
			
			RandomAccessFile escritor = new RandomAccessFile(fichero, "rw");
			System.out.println("Dime de cuantos numeros quieres hacer la sucesion de fibonacci:");
			int cantidadFibo = entrada.nextInt();
			List <Integer> fibonacci = fibo(cantidadFibo);
			for (int numerofi : fibonacci) {
				escritor.writeInt(numerofi);
			}
			System.out.println("Sucesion de numeros de fibonacci actualizada correctamente.");
			
			for (int numeroaImprimir: fibonacci) {
				System.out.println(numeroaImprimir);
			}
			System.out.println("Que posicion quieres buscar?");
			int posicion = entrada.nextInt();
			posicion *=4;
			entrada.nextLine();
			escritor.seek(posicion);
			
			System.out.println(escritor.readInt());
			
			escritor.close();
			
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
