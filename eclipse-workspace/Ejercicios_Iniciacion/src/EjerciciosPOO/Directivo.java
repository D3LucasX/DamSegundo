package EjerciciosPOO;
enum Turno {MORNING, AFTERNOON};

public class Directivo extends Persona{
	boolean esSalesiano;
	Turno turno;
	
	
	public Directivo(String dni, String nombre, String apellidos, double salario, boolean esSalesiano, Turno turno) {
		super(dni, nombre, apellidos, salario);
		this.esSalesiano = esSalesiano;
		this.turno = turno;
	}
	
}
