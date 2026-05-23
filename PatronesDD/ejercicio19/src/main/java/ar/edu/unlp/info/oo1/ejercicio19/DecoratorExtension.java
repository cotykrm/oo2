package ar.edu.unlp.info.oo1.ejercicio19;

public class DecoratorExtension extends Decorator{

    public DecoratorExtension(Componente componente){
        super(componente);
    }

    @Override
    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " - " + this.getComponente().getExtension();
    }

}
