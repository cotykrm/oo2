package ar.edu.unlp.info.oo1.ejercicio21;

public class MaximaDecorator extends Decorator {

    public MaximaDecorator (WeatherData componente){
        super(componente);
    }

    @Override
    public String displayData(){
        double max = this.getComponent().getTemperaturas().stream()
        .max((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
        return super.displayData() + "Máximo: " + max + "°; ";
    }

}
