package ar.edu.unlp.info.oo1.ejercicio13;

public abstract class MixingTank {

    private double temperature;
    private double volumen;

    public MixingTank(double temperature, double volumen){
        this.temperature = temperature; 
        this.volumen = volumen;
    }

    public double temperature(){
        return this.temperature;
    }

    public double upTo(){
        return this.volumen;
    }

    public


}
