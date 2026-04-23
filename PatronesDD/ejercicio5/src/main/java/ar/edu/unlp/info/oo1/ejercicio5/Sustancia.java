package ar.edu.unlp.info.oo1.ejercicio5;

public interface Sustancia {
	public abstract String formula();
	
	public abstract int pesoMolecular();
	
	public abstract int carga();
	
	public abstract boolean esValida();

	public boolean soyMetal();

	public boolean soyNoMetal();
}
