package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.List;

public abstract class Decorator implements WeatherData {

    private WeatherData componente;

    public Decorator(WeatherData componente) {
		this.componente = componente;
	}
	
	public WeatherData getComponent() {
		return this.componente;
	}
	public double getTemperatura() {
		return this.componente.getTemperatura();
	}
	public double getPresion() {
		return this.componente.getPresion();
	}
	public double getRadiacionSolar() {
		return this.componente.getRadiacionSolar();
	}
	public List<Double> getTemperaturas() {
		return this.componente.getTemperaturas();
	}
	public String displayData() {
		return this.componente.displayData();
	}

}
