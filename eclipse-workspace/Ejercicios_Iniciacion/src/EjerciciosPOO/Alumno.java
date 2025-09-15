package EjerciciosPOO;

import java.util.ArrayList;

enum Sexo{MASCULINO,fEMENINO};

public class Alumno extends Persona{
	String fechaNacimiento;
	Sexo sexo;
	boolean esRepartidor;
	ArrayList<Modulo> modulos = new ArrayList<Modulo>();
	
	
	public Alumno(String dni, String nombre, String apellidos, String fechaNacimiento, Sexo sexo,
			boolean esRepartidor) {
		super(dni, nombre, apellidos);
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.esRepartidor = esRepartidor;
		this.salario = 0;
	}
	
	public void añadirModulo (Modulo modulo){
		modulos.add(modulo);
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public boolean isEsRepartidor() {
		return esRepartidor;
	}
	public void setEsRepartidor(boolean esRepartidor) {
		this.esRepartidor = esRepartidor;
	}
	public ArrayList<Modulo> getModulos() {
		return modulos;
	}
	public void setModulos(ArrayList<Modulo> modulos) {
		this.modulos = modulos;
	}
	
}
