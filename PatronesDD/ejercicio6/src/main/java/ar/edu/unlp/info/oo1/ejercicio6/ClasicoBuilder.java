package ar.edu.unlp.info.oo1.ejercicio6;

public class ClasicoBuilder implements BuilderSandwich{

    private Sandwich resultado;

    @Override
    public void reiniciar() {
        this.resultado = new Sandwich();
    }

    @Override
    public void buildPan(){
        this.resultado.setPan(100);
    }

    @Override
    public void buildAderezo() {
        this.resultado.setAderezo(20);
    }

    @Override
    public void buildPrincipal() {
        this.resultado.setPrincipal(300);
    }

    @Override
    public void buildAdicional() {
        this.resultado.setAdicional(80);
    }

    public Sandwich retornarResultado(){
        return this.resultado;
    }

}
