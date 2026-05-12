package ar.edu.unlp.info.oo1.ejercicio12;

public class AutoEnAlquiler {
    private double precioPorDia;
    private int cantPlazas;
    private String marca;
    private Estrategia estrategia;
    
    public AutoEnAlquiler(double precioxDia, int cantPlazas, 
        String marca, Estrategia e){
        this.precioPorDia = precioxDia;
        this.cantPlazas = cantPlazas;
        this.marca = marca;
        this.estrategia = e;
    }

    public void setEstrategia(Estrategia e){
        this.estrategia = e;
    }

    public double getPrecioPorDia(){
        return this.precioPorDia;
    }

    public Estrategia getEstrategia(){
        return this.estrategia;
    }
}
