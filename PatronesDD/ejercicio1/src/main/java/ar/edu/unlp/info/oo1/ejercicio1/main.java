package ar.edu.unlp.info.oo1.ejercicio1;

public class main {
	public static void main(String[] args) {
        Biblioteca biblioL = new Biblioteca();
		
		biblioL.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioL.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));

        System.out.println(biblioL.exportarSocios());

		Exporter exp = new AdapterExporter();

		biblioL.setExporter(exp);

		System.out.println(biblioL.exportarSocios());
    }

}
