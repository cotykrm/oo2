package ar.edu.unlp.info.oo1.ejercicio4;

public abstract class Topografia {

    public abstract double proporcionAgua();

    public double proporcionTierra() {
        return 1.0 - this.proporcionAgua();
    }

    public abstract boolean igual(Topografia t);

    public abstract boolean compararConMixta(Mixta t);

    public abstract boolean compararConAgua(Agua t);

    public abstract boolean compararConTierra(Tierra t);

    public abstract boolean compararConPantano(Pantano t);

}
 