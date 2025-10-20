package JavaNio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class LecturaEscritura_JavaNio {
	// Lectura con clase Files de Java.NIO
	public static void LeerFiles() {
		// Parámetros ruta o URL
		Path ruta = Paths.get("ficheroEjemplo.txt");
		// Try catch para errores pero no hace falta usar el close porque no se bloquean
		// los procesos de
		// input y output
		try {
			String contenidoFiles = Files.readString(ruta);
			System.out.println(contenidoFiles);

			// ---------------------------------------------------------------//

			// Con este método cada linea es una parte de la lista.
			List<String> ListaContenido = Files.readAllLines(ruta);
			for (String linea : ListaContenido) {
				int i = 1;
				System.out.printf("Linea %d: %s", i, linea);
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Eescribir en un Fichero
	public static void EscrituraFiles() {
		// Con esto si no existe el fichero lo crea
		Path ruta = Paths.get("FicheroEscritura.txt");
		try {
			String contenido = "\nHola, esta es nu primera esccritura\n";
			// Con el segundo parámetro indicamos que el string lo tenemos en UTF8, para que
			// lo transforme a bytes bien
			// Con el tercer parámetro, si no existe el fichero, lo crea
			// y con el último parámetro indicamos que lo abra para escritura
			// Si ya existiera, tendríamos que poner append para que no elimine lo que ya
			// tiene
			// y que lo añada después.
			Files.write(ruta, contenido.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,
					StandardOpenOption.WRITE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// copiar el contenido de un archivo en otro
	public static void Copiar() {

		// Creamos archivo de origen(El que queremos copiar) y de destino(Donde lo
		// queremos copiar)
		Path rutaOrigen = Paths.get("FicheroEscritura.txt");
		Path rutaDestino = Paths.get("FicheroCopia.txt");
		try {
			Files.copy(rutaOrigen, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// llistar los contenidos de un directorio
	public static void listarContenido() {
		Path directorio = Path.of(".");
		try {
			Stream<Path> flujo = Files.list(directorio);
			// Esto es como hacer un for each normal pero aqui te deja hacerlo asi.
			flujo.forEach(archivo -> System.out.println(archivo.getFileName()));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// Ver las propiedades de un archivo
	public static void verPropiedades() {
		Path ruta = Path.of("FicheroEjemplo.txt");
		System.out.println("fichero existe: " + Files.exists(ruta));
		System.out.println("Fichero es directorio: " + Files.isDirectory(ruta));
	}
	
	// Borrar el Fichero
	public static void borrarFichero() {
		Path ruta = Path.of("FicheroCopia.txt");
		try {
			// Usamos la que tiene la comprobacion, borra si existe
			Files.deleteIfExists(ruta);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		LeerFiles();
		EscrituraFiles();
		Copiar();
		listarContenido();
		verPropiedades();
		borrarFichero();
	}

}
