package PracticaPlantasAplicación;

import java.io.Serializable;

public class Planta implements Serializable{
	private int codigo;
	private String nombre;
	private String foto;
	private String descripcion;

	public Planta(int codigo, String nombre, String imagen, String descripcion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.foto = imagen;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return foto;
	}

	public void setImagen(String imagen) {
		this.foto = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Planta [codigo=" + codigo + ", nombre=" + nombre + ", imagen=" + foto + ", descripcion=" + descripcion
				+ "]";
	}
	
	
}
