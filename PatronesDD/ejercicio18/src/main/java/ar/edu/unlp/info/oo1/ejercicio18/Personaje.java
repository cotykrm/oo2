package ar.edu.unlp.info.oo1.ejercicio18;


// debe tener los setters para que el builder le ponga valor
public class Personaje {
    private Armadura armadura;
    private Arma arma;
    private Habiblidades habiblidades;
    private int vida = 100;

    public void setArmadura(Armadura armadura){
        this.armadura = armadura;
    }

    public void setArma(Arma arma){
        this.arma = arma;
    }

    public void setHabilidades(Habiblidades habiblidades){
        this.habiblidades = habiblidades;
    }

    public void seVida(int vida){
        this.vida = vida;
    }

    public Habiblidades getHabilidades(){
        return this.habiblidades;
    }


}
