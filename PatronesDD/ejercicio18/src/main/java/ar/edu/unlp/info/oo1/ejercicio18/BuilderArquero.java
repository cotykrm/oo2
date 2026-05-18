package ar.edu.unlp.info.oo1.ejercicio18;

public class BuilderArquero extends BuilderPersonaje{

    @Override
    public void buildArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeCuero());
    }

    @Override
    public void buildArma() {
        this.getPersonaje().setArma(new Arco());
    }

    @Override
    public void buildHabilidades() {
        this.getPersonaje().setHabilidades(new Habiblidades());
        this.getPersonaje().getHabilidades().agregarHabilidad("Disparo de flechas");
    }

}
