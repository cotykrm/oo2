package ar.edu.unlp.info.oo1.ejercicio19;

public class DecoratorFechaCreacion extends Decorator{

    public DecoratorFechaCreacion (Componente componente){
        super(componente);
    }


    @Override
    public String prettyPrint(){
        return this.getComponente().prettyPrint() + " - " + this.getComponente().getFechaCreacion();
    }
}
