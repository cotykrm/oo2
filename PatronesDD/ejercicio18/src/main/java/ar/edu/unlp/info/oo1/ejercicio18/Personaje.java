package ar.edu.unlp.info.oo1.ejercicio18;


// debe tener los setters para que el builder le ponga valor
public class Personaje {
    private String nombre;
    private Armadura armadura;
    private Arma arma;
    private Habiblidades habiblidades;
    private int vida;

    public boolean puedeCombatir(){
        return this.vida > 0;
    }

    public void combatir(Personaje oponente){
        if (this.puedeCombatir()) {
            this.arma.atacarA(oponente);
        }
    }

    public void setArmadura(Armadura armadura){
        this.armadura = armadura;
    }

    public void setArma(Arma arma){
        this.arma = arma;
    }

    public void setHabilidades(Habiblidades habiblidades){
        this.habiblidades = habiblidades;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Habiblidades getHabilidades(){
        return this.habiblidades;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Armadura getArmadura() {
        return this.armadura;
    }

    public Arma getArma() {
        return this.arma;
    }

    public Habiblidades getHabiblidades() {
        return this.habiblidades;
    }

    public int getVida() {
        return this.vida;
    }

    

}
