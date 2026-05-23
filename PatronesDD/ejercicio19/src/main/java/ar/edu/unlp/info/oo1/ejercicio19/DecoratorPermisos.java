package ar.edu.unlp.info.oo1.ejercicio19;

public class DecoratorPermisos extends Decorator{

    public DecoratorPermisos(Componente componente){
        super(componente);
    }

    @Override
    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " - " + this.getComponente().getPermisos();
    }

}
