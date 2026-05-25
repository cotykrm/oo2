package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.List;

// componente (abstracto): porque es la interfaz que indica cual es el comportamiento de
// todos los componentes, tanto concretos como decoradores

public interface WeatherData {

    //retorna la temperatura en grados Fahrenheit. 
    public double getTemperatura();

    //retorna la presión atmosférica en hPa
    public double getPresion();

    //retorna la radiación solar
    public double getRadiacionSolar();

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturas();

    //retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData();

}
