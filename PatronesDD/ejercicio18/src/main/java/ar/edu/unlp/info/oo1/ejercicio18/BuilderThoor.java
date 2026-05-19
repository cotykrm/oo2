package ar.edu.unlp.info.oo1.ejercicio18;

public class BuilderThoor extends BuilderPersonaje{
    @Override
    public void buildArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeHierro());
    }

    @Override
    public void buildArma() {
        this.getPersonaje().setArma(new Martillo());
    }

    @Override
    public void buildHabilidades() {
        this.getPersonaje().setHabilidades(new Habiblidades());
        this.getPersonaje().getHabilidades().agregarHabilidad("Lanzar rayos");
        this.getPersonaje().getHabilidades().agregarHabilidad("Combate a distancia");
    }

}
