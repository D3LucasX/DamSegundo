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
	
	
	
}
