package EjerciciosPOO;

public class CentroMain {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor("090330405B", "Adrian", "pepe", 1222.3, 3, true);
		Profesor profesor2 = new Profesor("09033434343B", "Pepe", "Luis", 13456.3, 3, false);
		
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

}
