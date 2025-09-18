package EjerciciosPOO;

public class Profesor extends Persona{
	int num_asignaturas;
	boolean esTutor;
	public Profesor(String dni, String nombre, String apellidos, double salario, int num_asignaturas, boolean esTutor) {
		super(dni, nombre, apellidos, salario);
		this.num_asignaturas = num_asignaturas;
		this.esTutor = esTutor;
	}
	public int getNum_asignaturas() {
		return num_asignaturas;
	}
	public void setNum_asignaturas(int num_asignaturas) {
		this.num_asignaturas = num_asignaturas;
	}
	public boolean isEsTutor() {
		return esTutor;
	}
	public void setEsTutor(boolean esTutor) {
		this.esTutor = esTutor;
	}
	@Override
	public String toString() {
		return "Profesor [num_asignaturas=" + num_asignaturas + ", esTutor=" + esTutor + ", dni=" + dni + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", salario=" + salario + ", getNum_asignaturas()="
				+ getNum_asignaturas() + ", isEsTutor()=" + isEsTutor() + ", getDni()=" + getDni() + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getSalario()=" + getSalario()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
