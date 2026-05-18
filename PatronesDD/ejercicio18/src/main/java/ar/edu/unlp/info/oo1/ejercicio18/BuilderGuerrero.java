package ar.edu.unlp.info.oo1.ejercicio18;

public class BuilderGuerrero extends BuilderPersonaje{
    
    @Override
    public void buildArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeAcero());
    }

    @Override
    public void buildArma() {
        this.getPersonaje().setArma(new Espada());
    }

    @Override
    public void buildHabilidades() {
        this.getPersonaje().setHabilidades(new Habiblidades());
        this.getPersonaje().getHabilidades().agregarHabilidad("Combate cuerpo a cuerpo");
    }

}
