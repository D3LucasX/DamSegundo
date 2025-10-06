package FicherosAleatorios;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicherosAleatorIosIniciacion {

	public static void main(String[] args) {
		// Para usar el RandomAccess siempre tiene que ser de longitud fija las variables
		// para que cuando intente acceder a un dato, no entre en la mitad de la variable,
		// porque si no, esa variable no me la recuperaría.
		int numeroLista;
		String nombre = "Pedro";
		double nota;

		try {

			// Creamos el fichero binario
			File fichero = new File("datos.dat");
			fichero.createNewFile();

			RandomAccessFile raf = new RandomAccessFile(fichero, "rw");// El segundo parametro indicamos los permisos de
																	   // lectura r, escritura w o ambos wr

			raf.writeInt(1); // 4 bytes 
			raf.writeChars(nombre); // 10 bytes
			raf.writeDouble(6.5); // 8 bytes

			// Imprimimos la direccion del puntero del archivo
			System.out.println(raf.getFilePointer());

			//raf.seek(4); // nos posicionamos en la posicion 4 de memoria del archivo binario

			// Lee los primeros bytes de memoria del archivo binario
			//System.out.println(raf.readInt());
			
			// Lee los primeros bits de un archivo binario
			String cadena = "";
			raf.seek(0); // Indicamos al puntero que apunta a la primera posicion.
			while (raf.getFilePointer() < raf.length()) { // getFilepointer recupera la posicion donde esta apuntando el puntero
				System.out.println(raf.readInt());
				for (int i = 0; i < nombre.length(); i++) 
					cadena += raf.readChar();
				System.out.println(cadena);
				System.out.println(raf.readDouble());

			}

			raf.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
