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
	
	
	
}
