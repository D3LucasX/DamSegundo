package EjerciciosPOO;

//Al ser abstractos no se puede instanciar
abstract class Persona implements Comparable<Persona> {
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected double salario;
	
	// La clase es privada
	public Persona(String dni, String nombre, String apellidos, double salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}
	public Persona(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	// Clases hijas y las del paquete lo ven si son protected.
	// Con esto ahora lo que deberiamos de hacer en cada clase, deterinar como se calcularia el salario en función del
	// tipo de persona. No se va a calcular igual el salario de un profesor que de un directivo. Así que se tiene
	// que hacer una funcion get salario en cada clase (profesor, administracion...) y que en ella este como se calcula 
	// su salario.
	protected abstract double getSalario();
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int compareTo(Persona p) {
		if(salario>p.getSalario())
			return 1;
		if(salario < p.getSalario())
			return -1;
		return 0;
	}
	
}
