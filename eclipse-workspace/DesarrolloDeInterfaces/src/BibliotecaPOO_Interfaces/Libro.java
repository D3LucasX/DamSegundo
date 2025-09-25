package BibliotecaPOO_Interfaces;

import java.util.ArrayList;

public class Libro extends Articulo implements Prestable{
	boolean prestado = false;

	public Libro(String codigo, String titulo, int ano_publi, boolean prestado) {
		super(codigo, titulo, ano_publi);
		this.prestado = prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void setCodigo(String codigoParam) {
		this.codigo = "ISBN" + codigoParam;
	}

	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + ", codigo=" + codigo + ", titulo=" + titulo + ", ano_publi=" + ano_publi
				+ ", isPrestado()=" + isPrestado() + ", getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo()
				+ ", getAno_publi()=" + getAno_publi() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void prestar() {
		prestado = true;
	} 

	
	public void devolver() {
		prestado = false;
	}

	
	public boolean esPrestado() {
		return prestado;
	}
	
}
