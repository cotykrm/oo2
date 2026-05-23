package ar.edu.unlp.info.oo1.ejercicio19;

public class DecoratorNombre extends Decorator{

    public DecoratorNombre(Componente componente){
        super(componente);
    }

    @Override
    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " - " + this.getComponente().getNombre();
    }

}
