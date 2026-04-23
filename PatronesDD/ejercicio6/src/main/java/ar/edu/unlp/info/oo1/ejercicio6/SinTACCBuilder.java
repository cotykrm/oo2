package ar.edu.unlp.info.oo1.ejercicio6;

public class SinTACCBuilder implements BuilderSandwich{
    private Sandwich resultado;

    @Override
    public void reiniciar() {
        this.resultado = new Sandwich();
    }

    @Override
    public void buildPan(){
        this.resultado.setPan(150);
    }

    @Override
    public void buildAderezo() {
        this.resultado.setAderezo(18);
    }

    @Override
    public void buildPrincipal() {
        this.resultado.setPrincipal(250);
    }

    @Override
    public void buildAdicional() {
        this.resultado.setAdicional(200);
    }

    public Sandwich retornarResultado(){
        return this.resultado;
    }
}
