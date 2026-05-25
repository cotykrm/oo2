package ar.edu.unlp.info.oo1.ejercicio21;

public class MinimaDecorator extends Decorator {

    public MinimaDecorator (WeatherData componente){
        super(componente);
    }

    @Override
    public String displayData(){
        double min = this.getComponent().getTemperaturas().stream()
        .min((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
        return super.displayData() + "Minimo: " + min + "°; ";
    }

}
