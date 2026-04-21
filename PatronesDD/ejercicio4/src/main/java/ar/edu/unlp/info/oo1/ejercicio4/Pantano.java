package ar.edu.unlp.info.oo1.ejercicio4;

public class Pantano extends Topografia{

    @Override
    public double proporcionAgua() {
        return 0.7;
    }

    @Override
    public boolean igual(Topografia t) {
        return t.compararConPantano(this);
    }
    @Override
    public boolean compararConMixta(Mixta t) {
        return false;
    }

    @Override
    public boolean compararConAgua(Agua t) {
        return false;
    }

    @Override
    public boolean compararConTierra(Tierra t) {
        return false;
    }

    public boolean compararConPantano(Pantano t){
        return true;
    }

}
