package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherStationTest {

    HomeWeatherStation station;
    MaximaDecorator max;
    MinimaDecorator min;
    PromedioDecorator prom;
    CelsiusDecorator celsius;

    @BeforeEach
    void setUp(){
        station = new HomeWeatherStation(86, 1008, 200);
        celsius = new CelsiusDecorator(station);
        prom = new PromedioDecorator(celsius);
        min = new MinimaDecorator(prom);
        max = new MaximaDecorator(min);

        station.agregarTemperatura(82.4);
        station.agregarTemperatura(86.0);
        station.agregarTemperatura(89.6);

    }

    @Test
    void displayDataTest(){
        String resultado = "Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27; Máximo: 32;";
        assertEquals(resultado, max.displayData());
    }



}
