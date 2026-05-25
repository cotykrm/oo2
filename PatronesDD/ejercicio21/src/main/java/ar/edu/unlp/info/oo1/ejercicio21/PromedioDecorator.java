package ar.edu.unlp.info.oo1.ejercicio21;

public class PromedioDecorator extends Decorator {

    public PromedioDecorator (WeatherData componente){
        super(componente);
    }

    @Override
    public String displayData(){
        double prom = this.getComponent().getTemperaturas().stream()
        .mapToDouble(Double::doubleValue)
        .average()
        .orElse(0.0);
        return super.displayData() + "Promedio: " + prom + "°; ";
    }



}
