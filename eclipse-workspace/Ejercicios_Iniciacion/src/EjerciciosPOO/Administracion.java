package EjerciciosPOO;

enum Estudios {BAJO, MEDIO, AVANZADO};
public class Administracion extends Persona{
	Estudios estudios;
	int antiguedad;
	public Administracion(String dni, String nombre, String apellidos, double salario, Estudios estudios,
			int antiguedad) {
		super(dni, nombre, apellidos, salario);
		this.estudios = estudios;
		this.antiguedad = antiguedad;
	}
	public Estudios getEstudios() {
		return estudios;
	}
	public void setEstudios(Estudios estudios) {
		this.estudios = estudios;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
}
