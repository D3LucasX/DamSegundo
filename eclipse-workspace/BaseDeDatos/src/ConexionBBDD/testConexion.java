package ConexionBBDD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testConexion {
	// Con la clase Statement permiten hacer inyecciones SQL por eso no es conveniente usarla
	// con esa vulnerabilidad podrian siempre que una igualdad sea cierta, sacar cualquier valor de la tabla
	// (Where 1 = 1)
	public static void main (String[]args) {
		//Puerto de conexion por defecto es el 3306, si estuvieramos conectandonos a alguna base de datos
		// de por ahi, pondríamos la ip, en vez de local host
		String url = "jdbc:mysql://localhost:3306/mydb";
		String usuario = "root";
		String password = "cfgs";
		try {
			// 1. Cargar el driver de la base de datos
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Crear la conexión (Le damos las credenciales con las que se tiene que conectar)
			Connection conexion = DriverManager.getConnection(url,usuario,password);
			System.out.println("Nos hemos conectado a la base de datos.");
			
			// 3. Crear un Statment es una clase que me va a permitir crear una consulta en la base de datos
			Statement sentencia = conexion.createStatement();
			String consulta = "select * from usuario where ID_USUARIO = 1";
			ResultSet resultado = sentencia.executeQuery(consulta);
			
			// 4. Mostrar resultados
			while(resultado.next()) { // devuelve true hasta que sea null
				int ID_USUARIO = resultado.getInt("ID_USUARIO");
				String NOMBRE = resultado.getString("NOMBRE");
				Date FECHA = resultado.getDate("FECHA_NACIMIENTO");
				String GENERO = resultado.getString("GENERO");
				
				System.out.println("idUsuario: " + ID_USUARIO + " Nombre: " + NOMBRE + " Fecha: " + FECHA + " Genero: " + GENERO);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
