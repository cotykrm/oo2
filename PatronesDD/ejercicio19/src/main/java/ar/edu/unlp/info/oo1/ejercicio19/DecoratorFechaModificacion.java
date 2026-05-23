package ar.edu.unlp.info.oo1.ejercicio19;

public class DecoratorFechaModificacion extends Decorator{

    public DecoratorFechaModificacion(Componente componente){
        super(componente);
    }

    @Override
    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " - " + this.getComponente().getFechaModificacion();
    }

}
