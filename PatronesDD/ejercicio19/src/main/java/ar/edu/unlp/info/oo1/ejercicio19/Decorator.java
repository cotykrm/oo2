package ar.edu.unlp.info.oo1.ejercicio19;

public abstract class Decorator implements Componente{

    private Componente componente;

    public Componente getComponente(){
        return this.componente;
    }

    public String prettyPrint(){
        return this.componente.prettyPrint();
    }

    

}
