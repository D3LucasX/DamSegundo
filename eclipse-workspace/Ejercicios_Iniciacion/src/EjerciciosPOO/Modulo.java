package EjerciciosPOO;

public class Modulo {
	String nombre;
	int numero_horas;
	Profesor profesor;
	boolean esConvidable;
	
	public Modulo(String nombre, int numero_horas, Profesor profesor, boolean esConvidable) {
		super();
		this.nombre = nombre;
		this.numero_horas = numero_horas;
		this.profesor = profesor;
		this.esConvidable = esConvidable;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero_horas() {
		return numero_horas;
	}
	public void setNumero_horas(int numero_horas) {
		this.numero_horas = numero_horas;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public boolean isEsConvidable() {
		return esConvidable;
	}
	public void setEsConvidable(boolean esConvidable) {
		this.esConvidable = esConvidable;
	}
	@Override
	public String toString() {
		return "Modulo [nombre=" + nombre + ", numero_horas=" + numero_horas + ", profesor=" + profesor
				+ ", esConvidable=" + esConvidable + ", getNombre()=" + getNombre() + ", getNumero_horas()="
				+ getNumero_horas() + ", getProfesor()=" + getProfesor() + ", isEsConvidable()=" + isEsConvidable()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
