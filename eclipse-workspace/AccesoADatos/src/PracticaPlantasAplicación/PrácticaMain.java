package PracticaPlantasAplicación;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PrácticaMain {
public static void cargarXML(ArrayList<Planta> plantas) {
	try {
		// Creamos instancia fichero con el doc XML
		File plantasXML = new File("plantas.xml");
		// Creamos una instancia del DocumentBuilderFactory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// Creamos el documentBuilder
		DocumentBuilder docB = dbf.newDocumentBuilder();
		// Comprobamos si existe el documnto XML
		if (!plantasXML.exists()) {
			System.out.println("El archivo plantas.xml no existe");
			return;
		}
		//Hacemos el casting a tipo DocumentBuiloder
		Document documento = docB.parse(plantasXML);
		// acceddemos a los datos y normalizamos
		documento.getDocumentElement().normalize();
		
		// Creamos nodos para cada planta
		NodeList listaPlantas = documento.getElementsByTagName("planta");
		
		// Consegimos la cantidad de nodos para hacer un bucle y recorrerlos
		int longitudNodos = listaPlantas.getLength();
		
		for (int i = 0; i<longitudNodos; i++) {
			// Separamos cada planta con sus atributos
			Node nodo = listaPlantas.item(i);
			
			// Compriobamos que esta solo seleccionando nodos con etiqueta
			// de apertura y de cierre
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {
				Element planta = (Element)nodo;
				
				// Creamos las plantas
				Planta nuevaPlanta = new Planta(
						Integer.valueOf(planta.getElementsByTagName("codigo").item(0).getTextContent()),
						planta.getElementsByTagName("nombre").item(0).getTextContent(),
						planta.getElementsByTagName("foto").item(0).getTextContent(),
						planta.getElementsByTagName("descripcion").item(0).getTextContent()
						);
				// Añadimos las plantas cargadas al array de plantas
				plantas.add(nuevaPlanta);
			}
			
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void cargarEmpleados(ArrayList <Empleado> listaEmpleados) {
	try {
		DataInputStream dis = new DataInputStream(new FileInputStream("empleado.dat"));
		ObjectInputStream in = new ObjectInputStream(dis);
		for(Empleado empleado: listaEmpleados) {
			int id = in.readInt();
			String nombre = in.readUTF();
			String password = in.readUTF();
			String cargo = in.readUTF();
			listaEmpleados.add(empleado);
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		ArrayList <Planta> plantas = new ArrayList<>(); 
		ArrayList <Empleado> listaEmpleados = new ArrayList<>();
		// Cargamos documento XML
		cargarXML(plantas);
		int longArrList = plantas.size();
		for(int i = 0; i < longArrList; i++ ) {
			System.out.println(plantas.get(i));
		}
		cargarEmpleados(listaEmpleados);
	}
}
