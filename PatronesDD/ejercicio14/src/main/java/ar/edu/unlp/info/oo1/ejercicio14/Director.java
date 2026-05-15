package ar.edu.unlp.info.oo1.ejercicio14;

public class Director {
    private BuilderPC builder;

    public Director(BuilderPC builder){
        this.builder = builder;
    } 

    public void setBuilder(BuilderPC builder){
        this.builder = builder;
    }

    public PC construir(){
        builder.buildProcesador();
        builder.buildRAM();
        builder.buildDisco();
        builder.buildGrafica();
        builder.buidGabinete();
        return builder.resultado();

    }

}
