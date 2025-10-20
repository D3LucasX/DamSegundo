package _01_04_LecturaXML;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mainClaseCorreccion {
	public static int posicionSegunPrecio(double precio, ArrayList <FrutaCorreccion> Frutas) {
		int posicion = -1;
		int posicionAnterior = 0;
		for(int i = 0; i < Frutas.size(); i++) {
			if(Frutas.get(i).getPrecio() == precio) {
				posicion = i;
			}else {
				if(Frutas.get(i).getPrecio() > precio) {
					posicionAnterior = i-1;
				}
			}
		}
		
		return posicion;
	}
	public static void main(String[] args) {
		ArrayList<FrutaCorreccion> Frutas = new ArrayList<>();
		try {
			File ficheroXML = new File("frutas.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder docB = dbf.newDocumentBuilder();
			Document documento = docB.parse(ficheroXML);
			documento.getDocumentElement().normalize();
			// de normal las etiquetas estan en minúsculas
			NodeList listaFrutas = documento.getElementsByTagName("fruta");
			int longitud = listaFrutas.getLength();
			for (int i = 0; i < longitud; i++) {
				// Aquí separamos ya cada fruta con sus atributos y etiquetas.
				Node nodo = listaFrutas.item(i);
				// Comprobación de que cogemos solo un nodo. Que no es el nodo Raiz. Que tiene etiqueta de apertura y de cierre.
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element fruta = (Element)nodo;
					// Hacemos el constructor
					ArrayList<String> nutrientes = new ArrayList<>();
					FrutaCorreccion piezaFruta = new FrutaCorreccion(
							fruta.getElementsByTagName("nombre").item(0).getTextContent(),
							fruta.getElementsByTagName("tipo").item(0).getTextContent(),
							fruta.getElementsByTagName("color").item(0).getTextContent(),
							fruta.getElementsByTagName("origen").item(0).getTextContent(),
							Double.valueOf(fruta.getElementsByTagName("precio").item(0).getTextContent()),
							fruta.getElementsByTagName("temporada").item(0).getTextContent()
							);
					NodeList listaNutrientes = fruta.getElementsByTagName("nutriente");
					for(int j = 0; j<listaNutrientes.getLength();j++) {
						nutrientes.add(listaNutrientes.item(j).getTextContent());
					}
					piezaFruta.setNutrientes(nutrientes);
					Frutas.add(piezaFruta);
				}
				// Ordenar por el precio
				Frutas.sort(Comparator.comparing(FrutaCorreccion::getPrecio));
			}
			//
			for (FrutaCorreccion elemento:Frutas) {
				System.out.println(elemento.toString());
				ArrayList<String> nutrientes = elemento.getNutrientes();
				for (String nutriente:nutrientes) {
					System.out.println(nutriente);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
