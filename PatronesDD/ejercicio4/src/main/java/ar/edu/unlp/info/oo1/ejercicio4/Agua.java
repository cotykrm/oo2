package ar.edu.unlp.info.oo1.ejercicio4;

public class Agua extends Topografia{

    public double proporcionAgua(){
        return 1;
    }

    //como yo se que soy agua le digo al otro que se compare conmigo,
    //si el otro es agua, va a retornar true, pero al hacerlo asi,
    //ya se a que metodo tengo que llamar
    
    public boolean igual(Topografia t){
        return t.compararConAgua(this);
    }

    public boolean compararConMixta(Mixta t){
        return false;
    }

    public boolean compararConAgua(Agua t){
        return true;
    }

    public boolean compararConTierra(Tierra t){
        return false;
    }

    public boolean compararConPantano(Pantano t){
        return false;
    }
}
