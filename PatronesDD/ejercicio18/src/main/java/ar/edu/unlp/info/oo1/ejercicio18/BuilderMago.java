package ar.edu.unlp.info.oo1.ejercicio18;
public class BuilderMago extends BuilderPersonaje{

    @Override
    public void buildArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeCuero());
    }

    @Override
    public void buildArma() {
        this.getPersonaje().setArma(new Baston());
    }

    @Override
    public void buildHabilidades() {
        this.getPersonaje().setHabilidades(new Habiblidades());
        this.getPersonaje().getHabilidades().agregarHabilidad("Magia");
        this.getPersonaje().getHabilidades().agregarHabilidad("Combate a distancia");
    }



}
