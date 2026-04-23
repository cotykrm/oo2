package ar.edu.unlp.info.oo1.ejercicio6;

public class VegetarianoBuilder implements BuilderSandwich{

    private Sandwich resultado;

    @Override
    public void reiniciar() {
        this.resultado = new Sandwich();
    }

    @Override
    public void buildPan(){
        this.resultado.setPan(120);
    }

    @Override
    public void buildAderezo() {
        this.resultado.setAderezo(0);
    }

    @Override
    public void buildPrincipal() {
        this.resultado.setPrincipal(200);
    }

    @Override
    public void buildAdicional() {
        this.resultado.setAdicional(100);
    }

    public Sandwich retornarResultado(){
        return this.resultado;
    }

}
