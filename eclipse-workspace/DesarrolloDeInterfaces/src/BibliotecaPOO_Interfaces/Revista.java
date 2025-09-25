package BibliotecaPOO_Interfaces;

public class Revista extends Articulo{
	int numeroEdicion;

	public Revista(String codigo, String titulo, int ano_publi, int numeroEdicion) {
		super(codigo, titulo, ano_publi);
		this.numeroEdicion = numeroEdicion;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	@Override
	public String toString() {
		return "Revista [numeroEdicion=" + numeroEdicion + ", codigo=" + codigo + ", titulo=" + titulo + ", ano_publi="
				+ ano_publi + ", getNumeroEdicion()=" + getNumeroEdicion() + ", getCodigo()=" + getCodigo()
				+ ", getTitulo()=" + getTitulo() + ", getAno_publi()=" + getAno_publi() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void setCodigo(String codigoParam) {
		this.codigo = "ISSN" + codigoParam;
	}
	
}
