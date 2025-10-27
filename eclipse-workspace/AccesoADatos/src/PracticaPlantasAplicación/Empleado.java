package PracticaPlantasAplicación;

import java.util.ArrayList;

public class Empleado {
	private int ide;
	private String nombre_empleado;
	private String password;
	private String cargo;
	private ArrayList<Empleado> listaEmpleados ;

	public Empleado(int ide, String nombre_empleado, String password) {
		super();
		this.ide = ide;
		this.nombre_empleado = nombre_empleado;
		this.password = password;
		this.listaEmpleados = new ArrayList<>();
	}

	public int getIde() {
		return ide;
	}

	public void setIde(int ide) {
		this.ide = ide;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Empleado [ide=" + ide + ", nombre_empleado=" + nombre_empleado + ", password=" + password + "]";
	}

}
