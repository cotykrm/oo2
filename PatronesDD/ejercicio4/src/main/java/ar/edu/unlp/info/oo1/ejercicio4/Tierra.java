package ar.edu.unlp.info.oo1.ejercicio4;

public class Tierra extends Topografia{
    
    public double proporcionAgua(){
        return 0;
    }

    public boolean igual(Topografia t){
        return t.compararConTierra(this);
    }

    public boolean compararConMixta(Mixta t){
        return false;
    }

    public boolean compararConAgua(Agua t){
        return false;
    }

    public boolean compararConTierra(Tierra t){
        return true;
    }

    public boolean compararConPantano(Pantano t){
        return false;
    }
    

}
