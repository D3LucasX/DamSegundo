package Ejercicios_Iniciación;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("de que dimensiones quiere crear la matriz?");
		int numero = entrada.nextInt();
		entrada.nextLine();
		
		int[][] array = new int[numero][numero];
		
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				 array[i][j] = random(j+3);
				 System.out.println(array[i][j]);
			}
		}

	}
	public static int random(int numero) {
		 return (int) Math.floor(Math.random()*(numero + 1));
	 }
}
 