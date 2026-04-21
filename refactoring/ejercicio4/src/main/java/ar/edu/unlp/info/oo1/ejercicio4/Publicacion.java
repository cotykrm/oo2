package ar.edu.unlp.info.oo1.ejercicio4;

public class Publicacion {
	private String texto;
	private int likes;
	
	public Publicacion(String texto) {
		this.texto = texto;
	    this.likes = 0;
	}
	
	public void darLike() { likes++; }
	
	public void darDislike() { likes--; }
	
	private int impacto() {
		return likes * 3;
	}
	public int alcance() {
		return impacto() * 10;
	}
	//Rename method: procesar (referenciado en línea 11 de Publicacion.java) por impacto
	//Rename method: calcular (referenciado en línea 14 de Publicacion.java) por alcance

}

