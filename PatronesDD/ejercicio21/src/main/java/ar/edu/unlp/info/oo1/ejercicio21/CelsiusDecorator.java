package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.List;
import java.util.stream.Collectors;

// modificar, si se llama esta funcon, deberia sobreescribir la temperatura en F, 
// con la temperatura en C; no debo agregarla al final

public class CelsiusDecorator implements WeatherData{

    private HomeWeatherStation station;

    public CelsiusDecorator(HomeWeatherStation station) {
		this.station = station;
	}
	
	public WeatherData getStation() {
		return this.station;
	}

    
    private double convertirACelsius(double temperaturaF){
        return (temperaturaF - 32) / 1.8;
    }

    @Override
	public double getTemperatura() {
		return this.convertirACelsius(station.getTemperatura());
	}

    @Override
	public double getPresion() {
		return this.station.getPresion();
	}

    @Override
	public double getRadiacionSolar() {
		return this.station.getRadiacionSolar();
	}

    @Override
	public List<Double> getTemperaturas() {
		return this.station.getTemperaturas().stream()
                .map(temp -> this.convertirACelsius(temp))
                .collect(Collectors.toList());
    }

    @Override
    public String displayData(){
        return "Temperatura C: " + this.getTemperatura() +
   	        "Presión atmosf: " + this.getPresion() +
   	        "Radiación solar: " + this.getRadiacionSolar();

    }

}
