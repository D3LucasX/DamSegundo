package manejoDeFicheros_PrimeraTarea;

import java.io.File;
import java.util.Scanner;

public class Ejercicios01_01Ficheros_EJ5 {

	public static void main(String[] args) {
		int totalPermisos = 0;
		String nuevoPermiso = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("De que fichero quieres comprobar los permisos?: (Escribe la ruta) ");
		String FicheroNombre = entrada.nextLine();
		
		File FicheroAcomprobar = new File(FicheroNombre);
		
		if(FicheroAcomprobar.exists()) {
			String permiso = quePermisosTiene(FicheroAcomprobar);
			System.out.println(permiso);
			if (permiso.equals("RWX")) {
				System.out.println("Desea cambiar los permisos?: ");
				String deseaCambioPerm = entrada.nextLine();
				
				if (deseaCambioPerm.equalsIgnoreCase("si")) {
					nuevoPermiso = cambiarPermisos(entrada, FicheroAcomprobar);
					System.out.println(nuevoPermiso);
				}
			}
		}else {
			System.out.println("El fichero introducido no existe.");
		}
	}
	public static String quePermisosTiene(File FicheroAcomprobar) {
		String permisos = "";
		if (FicheroAcomprobar.canRead()) {
			permisos = "R";
		}else {
			permisos = "_";
		}
		if (FicheroAcomprobar.canWrite()) {
			permisos += "W";
		}else {
			permisos += "_";
		}
		if (FicheroAcomprobar.canExecute()) {
			permisos += "X";
		}else {
			permisos += "_";
		}
		return permisos;
	}
	public static String cambiarPermisos(Scanner entrada, File ficheroAComprobar) {
		String nuevoPermiso = "";
		System.out.println("Que permiso desea cambiar?: (Escribe R para lectura, W para escritura y X para ejecucion)");
		String permisosCambiados = entrada.nextLine();
		if (permisosCambiados.equalsIgnoreCase("R")) {
			ficheroAComprobar.setReadable(false);
			nuevoPermiso = "_WX";
		}else if(permisosCambiados.equalsIgnoreCase("W")) {
			ficheroAComprobar.setWritable(false);
			nuevoPermiso = "R_X";
		}else if(permisosCambiados.equalsIgnoreCase("X")){
			ficheroAComprobar.setExecutable(false);
			nuevoPermiso = "RW_";
		}else {
			System.out.println("Para cambiar los permisos, Escribe R para lectura, W para escritura y X para ejecucion, vuelva a ejecutar el programa, gracias");
		}
		return nuevoPermiso;
	}

}
