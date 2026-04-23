package ar.edu.unlp.info.oo1.ejercicio5;

public class Atomo implements Sustancia{

    private String nombre;
    private String simbolo; 
    private int pesoAtomico;
    private int carga;
    private boolean soyMetal;

    public Atomo(String nombre, String simbolo, int peso, int carga, boolean metal){
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.pesoAtomico = peso;
        this.carga = carga;
        this.soyMetal = metal;
    }

    @Override
    public String formula() {
        return this.simbolo;
    }

    @Override
    public int pesoMolecular() {
        return this.pesoAtomico;
    }

    @Override
    public int carga() {
        return this.carga;
    }

    @Override
    public boolean esValida() {
        return true;
    }

    public boolean soyMetal(){
        return this.soyMetal;
    }

    public boolean soyNoMetal(){
        return !this.soyMetal();
    }

}
