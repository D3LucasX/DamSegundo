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


	@Override
	public String toString() {
		return "Directivo [esSalesiano=" + esSalesiano + ", turno=" + turno + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", salario=" + salario + ", getSalario()=" + getSalario() + ", getDni()="
				+ getDni() + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	protected double getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
