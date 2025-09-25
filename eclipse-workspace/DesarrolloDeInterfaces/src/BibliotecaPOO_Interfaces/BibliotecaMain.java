package BibliotecaPOO_Interfaces;

import java.util.ArrayList;

public class BibliotecaMain {
	public static void prestar(ArrayList <Libro> listaLibros, String codigoABuscar) {
		String titulo = "";
		for (Libro libroAPrestar : listaLibros) {
			if (libroAPrestar.getCodigo().equalsIgnoreCase(codigoABuscar) && libroAPrestar.isPrestado() == false) {
				titulo = libroAPrestar.getTitulo();
				libroAPrestar.prestar();
			}else {
				System.out.println("Ya esta prestado el libro que está solicitando. ");
			}
		}
		System.out.println("El libro " + titulo + " con codigo " + codigoABuscar + " ha sido prestado correctamente.");
	} 


	public void devolver(ArrayList <Libro> listaLibros, String codigoABuscar) {
		String titulo = "";
		for (Libro libroADevolver : listaLibros) {
			if (libroADevolver.getCodigo().equalsIgnoreCase(codigoABuscar)) {
				titulo = libroADevolver.getTitulo();
				if (libroADevolver.isPrestado()) {
					libroADevolver.devolver();
					System.out.println("Libro" + titulo + " devuelto correctamente.");
				}else {
					System.out.println("Este libro no esta prestado, no lo puedes devolver");
				}
			}
		}
		System.out.println("El libro " + titulo + " con codigo " + codigoABuscar + " ha sido prestado correctamente.");
	}


	public void esPrestado(ArrayList <Libro> listaLibros, String codigoABuscar) {
		String titulo= "";
		for (Libro libroAComprobar : listaLibros) {
			if (libroAComprobar.getCodigo().equalsIgnoreCase(codigoABuscar)) {
				titulo = libroAComprobar.getTitulo();
				if (libroAComprobar.esPrestado() == true) {
					System.out.println("Libro" + titulo + " esta acutalmente prestado.");
				}else {
					System.out.println("Este libro no esta prestado");
				}
			}
		}
		System.out.println("El libro " + titulo + " con codigo " + codigoABuscar + " ha sido prestado correctamente.");
	}
	
	public void mostrarMenu() {
		System.out.println("1. Mostrar libros. ");
		System.out.println("2. Prestar libro. ");
		System.out.println("3. Devolver Libro. ");
		System.out.println("4. El libro que quieres esta prestado? ");
	}
	
	
	public static void main(String[] args) {
		ArrayList<Libro> listaLibros = new ArrayList<>();
		
		
		Libro libro1 = new Libro("32594085", "Las historietas de Leo", 1937, false);
		Libro libro2 = new Libro("32594345", "Las historietas de Andreu", 2013, false);
		
		listaLibros.add(libro1);
		listaLibros.add(libro2);
		
		
	}

}

