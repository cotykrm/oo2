package ar.edu.unlp.info.oo1.ejercicio18;


// esta clase solo va a tener las firams de los metodos para agregarle los elementos
public abstract class BuilderPersonaje {

    private Personaje personaje;

    public BuilderPersonaje(){
        this.reiniciar();
    }

    public void reiniciar(){
        this.personaje = new Personaje();
    }

    public void setNombre(String nombre){
        this.getPersonaje().setNombre(nombre);
    }

    public void setVida(){
        this.getPersonaje().setVida(100);
    }

    public abstract void buildArmadura();

    public abstract void buildArma();

    public abstract void buildHabilidades();

    public Personaje resultado(){
        return this.personaje;
    }

    public Personaje getPersonaje(){
        return this.personaje;
    }


}