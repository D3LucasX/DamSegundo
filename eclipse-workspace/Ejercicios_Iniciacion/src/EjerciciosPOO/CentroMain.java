package EjerciciosPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class CentroMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Profesor> listaProfes = new ArrayList<>();
		
		
		Profesor profesor1 = new Profesor("090330405B", "Adrian", "pepe", 1222.3, 3, true);
		Profesor profesor2 = new Profesor("09033434343B", "Pepe", "Luis", 13456.3, 3, false);
		listaProfes.add(profesor1);
		listaProfes.add(profesor2);
		
		Administracion administrador1 = new Administracion("09090990333", "Andrea", "Luisa", 1222223.2, Estudios.AVANZADO, 12);
		Administracion administrador2 = new Administracion("09095689333", "Raton", "Leo", 12254223.2, Estudios.BAJO, 32);
		
		Directivo directivo1 = new Directivo("09090333920393C","Daniel","Garcia",12223.33, false, Turno.AFTERNOON);
		Directivo directivo2 = new Directivo("043434333920393C","Ruben","Garcia",12223.33, false, Turno.MORNING);
		
		Modulo Dam = new Modulo("Desarrollo de aplicaciones multiplatacorma", 12, profesor2, false);
		Modulo Teleco = new Modulo("Telecomunicaciones", 12, profesor1, true);
		
		Alumno alumno1 = new Alumno("90248930m", "jose", "de lucas", "23-3-4", Sexo.MASCULINO, false);
		Alumno alumno2 = new Alumno("90248930m", "jose", "de lucas", "23-3-4", Sexo.MASCULINO, false);
		
		alumno1.añadirModulo(Dam);
		alumno2.añadirModulo(Teleco);
	}
	
	public static Profesor darAltaProfesor(Scanner entrada) {
		String esTutor = "";
		boolean tutor = false;
		System.out.println("Introduce el DNI del nuvo profesor: ");
		String dniNuevo = entrada.nextLine();
		System.out.println("Introduce el nombre del nuevo profesor: ");
		String nombreNuevo = entrada.nextLine();
		System.out.println("Introduce los paellidos del nuevo profesor: ");
		String apellidoNuevo = entrada.nextLine();
		System.out.println("Introduzca el salario del nuevo profesor: ");
		double salarioNuevo = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Introduce el numero de asignaturas: ");
		int numeroAsignaturas = entrada.nextInt();
		entrada.nextLine();
		do {
			System.out.println("Es tutor de alguna clase? (Escriba si o no):");
			esTutor = entrada.nextLine();
			if (esTutor.equalsIgnoreCase("si")) {
				tutor = true;
			}else if (esTutor.equalsIgnoreCase("no")) {
				tutor = false;
			}else {
				System.out.println("Ha ocurrido un error, no se ha podido determinar si el profesor es tutor o no.");
				System.out.println("Intentelo de nuevo");
			}
		}while(!esTutor.equalsIgnoreCase("si") || esTutor.equalsIgnoreCase("no"));
		Profesor nuevoProfesor = new Profesor(dniNuevo, nombreNuevo, apellidoNuevo, salarioNuevo, numeroAsignaturas, tutor);
		return nuevoProfesor;
	}
	
	
	public static Alumno darAltaAlumno(Scanner entrada) {
		Alumno nuevoAlumno = new Alumno(null, null, null, null, null, false);
		String fechaNacimiento= "";
		Sexo genero = null;
		boolean fechaAdecuada = false;
		boolean esRepartidor = false;
		String sexo = "";
		System.out.println("Introduce el DNI del nuvo Alumno: ");
		String dniNuevo = entrada.nextLine();
		nuevoAlumno.setDni(dniNuevo);
		System.out.println("Introduce el nombre del nuevo Alumno: ");
		String nombreNuevo = entrada.nextLine();
		nuevoAlumno.setNombre(nombreNuevo);
		System.out.println("Introduce los paellidos del nuevo Alumno: ");
		String apellidoNuevo = entrada.nextLine();
		do {
			System.out.println("introduce la fecha de nacimiento del alumno: (xx-xx-xxxx)");
			fechaNacimiento = entrada.nextLine();
			fechaAdecuada = comprobarFecha(fechaNacimiento);
			if (fechaAdecuada == true) {
				System.out.println("Fecha válida.");
			}else {
				System.out.println("Fecha inválida, inténtelo de nuevo.");
			}
		}while(fechaAdecuada == false);
		nuevoAlumno.setFechaNacimiento(fechaNacimiento);
		do {
			System.out.println("Introduzca el sexo del alumno: ");
			sexo = entrada.nextLine();
			if (sexo.equalsIgnoreCase("masculino")) {
				genero = nuevoAlumno.sexo.MASCULINO;
			}else if (sexo.equalsIgnoreCase("femenino")) {
				genero = nuevoAlumno.sexo.fEMENINO;
			}else {
				System.out.println("No se ha podido asignar el sexo del alumno, intentelo de nuevo.");
			}
		}while(!sexo.equalsIgnoreCase("masculino") || !sexo.equalsIgnoreCase("femenino"));
		nuevoAlumno.setSexo(genero);
		do {
			System.out.println("Es repartidor?: (si o no)");
			String repartidor = entrada.nextLine();
			if (repartidor.equalsIgnoreCase("si")) {
				esRepartidor = true;
			}else if (repartidor.equalsIgnoreCase("no")) {
				esRepartidor= false;
			}else {
				System.out.println("No se ha podido determinar si es repartidor, intentelo de nuevo.");
			}
		}while(!sexo.equalsIgnoreCase("masculino") || !sexo.equalsIgnoreCase("femenino"));
		nuevoAlumno.setEsRepartidor(esRepartidor);
		return nuevoAlumno;
	}
	
	public static Modulo crearModulo(Scanner entrada,ArrayList<Profesor> listaProfes) {
		int encontrado = 0;
		String convidable = "";
		boolean esConvidable = false;
		Modulo moduloNuevo = new Modulo(null, 0, null, false);
		Profesor dniProfeAbuscar = new Profesor(null, null, null, 0, 0, false);
		System.out.println("Introduce el nombre del nuevo profesor: ");
		String nombreNuevo = entrada.nextLine();
		moduloNuevo.setNombre(nombreNuevo);
		System.out.println("introduzca el numero de horas que tenga el curso: ");
		int numeroHoras = entrada.nextInt();
		entrada.nextLine();
		moduloNuevo.setNumero_horas(numeroHoras);
		do {
			System.out.println("Introduce el numero de DNI del profesor que está asociado a este módulo: ");
			String dniProfesor = entrada.nextLine();
			for (Profesor prof : listaProfes) {
				if (dniProfeAbuscar.getDni().equalsIgnoreCase(dniProfesor)) {
					moduloNuevo.setProfesor(dniProfeAbuscar);
					encontrado = 1;
				}else {
					System.out.println("no se ha encontrado a ese profesor");
					encontrado = 0;
				}
			}
		}while(encontrado == 0);
		do {
			System.out.println("El modulo es convidable?");
			convidable =entrada.nextLine();
		}while();
		
	}
	

	public static boolean comprobarFecha(String fecha) {
		boolean esAdecuada = false;
		String regex = "/[1-3]{2}-[0-1]{2}-0-9{4}/";
		if (fecha.matches(regex)) {
			esAdecuada = true;
		}else {
			esAdecuada = false;
		}
		return esAdecuada;
	}

}
