package ejerciciosDeEscritura_SegundaTarea;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ejercicio1_escribirNumerosPrimos {
public static boolean esPrimo(int n) {
	if (n < 2) return false; 
	for (int i = 2; i <= Math.sqrt(n); i++) {
		if (n % i == 0) return false;
	}
	return true;
}
public static List<Integer> primoHasta500(){
	List<Integer> primos = new ArrayList<>();
	 for (int i = 1; i <= 500; i++) {
	        if (esPrimo(i)) {
	            primos.add(i);
	        }
	    }
	    return primos;
}
	public static void main(String[] args) {
		File carpeta = new File("C:/Users/DAM/Downloads");
		File nuevoFichero = new File(carpeta,"primos");
		try {
			if (nuevoFichero.createNewFile()) {
				System.out.println("Fichero creado: " + nuevoFichero.getAbsolutePath());
			}
		}catch(IOException ioe) {
			System.out.println("Error al crear el fichero.");
			ioe.getMessage();
		}
		// lO MEJOR ES QUE ESTE ESTE TRY CATCH DENTRO DEL OTRO TRY CATCH, PARA IR ESPECIFICANDO LOS ERRORES, ESTA EN LA CORRECCIONE QUE SUBE BEA
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoFichero))){
			List<Integer> primos = primoHasta500();
			
			for (int primo : primos) {
				writer.write(primo + ", ");
			}
			System.out.println("Archivo actualizado correctamente.");
		}catch(IOException ioe) {
			System.out.println("Error al editar el fichero.");
			ioe.getMessage();
		}
	}

}
