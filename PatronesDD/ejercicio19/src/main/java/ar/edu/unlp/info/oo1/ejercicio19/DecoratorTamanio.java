package ar.edu.unlp.info.oo1.ejercicio19;

public class DecoratorTamanio extends Decorator{

    public DecoratorTamanio(Componente componente){
        super(componente);
    }

    @Override
    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " - " + this.getComponente().getTamanio();
    }

}
