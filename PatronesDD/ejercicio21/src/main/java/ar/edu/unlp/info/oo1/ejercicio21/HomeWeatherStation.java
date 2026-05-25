package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.ArrayList;
import java.util.List;

// componente concreto
public class HomeWeatherStation implements WeatherData{

    private double temperatura;
    private double presion;
    private double radiacionSolar;
    private List<Double> temperaturas;
    
    public HomeWeatherStation (double temperatura, double presion, 
        double radiacionSolar){
            this.temperatura = temperatura;
            this.presion = presion;
            this.radiacionSolar = radiacionSolar;
            this.temperaturas = new ArrayList<>();

    }

    public void agregarTemperatura(Double temperatura){
        this.temperaturas.add(temperatura);

    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPresion() {
        return presion;
    }

    public double getRadiacionSolar() {
        return radiacionSolar;
    }
    
    public List<Double> getTemperaturas(){
        return this.temperaturas;
    }

    public String displayData(){
        return "Temperatura F: " + this.getTemperatura() +
   	        "Presión atmosf: " + this.getPresion() +
   	        "Radiación solar: " + this.getRadiacionSolar();
    }
    
}
