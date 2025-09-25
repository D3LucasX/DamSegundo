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
	public double getSalario() {
		salario = 1500;
		antiguedad = getAntiguedad();
		salario = salario * (antiguedad * 10);
		return salario;
		
	}
	@Override
	public String toString() {
		return "Administracion [estudios=" + estudios + ", antiguedad=" + antiguedad + ", dni=" + dni + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", salario=" + salario + ", getEstudios()=" + getEstudios()
				+ ", getAntiguedad()=" + getAntiguedad() + ", getSalario()=" + getSalario() + ", getDni()=" + getDni()
				+ ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
