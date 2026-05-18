package ar.edu.unlp.info.oo1.ejercicio18;

// esta clase es la encargada de construir un objeto parte por parte, 
// se debe poder cambiar de builder

public class Director {

    private BuilderPersonaje builder;

    public void setBuilder(BuilderPersonaje builder){
        this.builder = builder;
    }

    public Personaje construir(){
        builder.buildArma();
        builder.buildArmadura();
        builder.buildHabilidades();
        return builder.resultado();

    }


}
