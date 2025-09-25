package BibliotecaPOO_Interfaces;

abstract class Articulo {
	protected String codigo;
	protected String titulo;
	protected int ano_publi;
	
	public Articulo(String codigo, String titulo, int ano_publi) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.ano_publi = ano_publi;
	}

	public String getCodigo() {
		return codigo;
	}

	public abstract void setCodigo(String codigo);

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno_publi() {
		return ano_publi;
	}

	public void setAno_publi(int ano_publi) {
		this.ano_publi = ano_publi;
	}
	
}
