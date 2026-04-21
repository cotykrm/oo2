package ar.edu.unlp.info.oo1.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class BibliotecaTest {
	
	public Biblioteca biblioV;
	public Biblioteca biblioL;
	private JSONParser parseo;
	
	
	@BeforeEach
	void setUp(){
		biblioV = new Biblioteca();
		biblioL = new Biblioteca();
		biblioL.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioL.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));


		Exporter exp = new AdapterExporter();
		biblioV.setExporter(exp);
		biblioL.setExporter(exp);

		parseo = new JSONParser();
	}

	@Test
	void exportarTest() throws ParseException {
		String salida = "[\n"
				+ "	{\n"
				+ "		\"Nombre: \": \"Arya Stark\",\n"
				+ "		\"Email: \": \"needle@stark.com\",\n"
				+ "		\"Legajo: \": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"Nombre: \": \"Tyron Lannister\",\n"
				+ "		\"Email: \": \"tyron@thelannisters.com\",\n"
				+ "		\"Legajo: \": \"2345-2\"\n"
				+ "	}\n"
				+ "]\n"
				+ "";
		assertEquals(parseo.parse(salida), parseo.parse(this.biblioL.exportarSocios()));

	}

}
