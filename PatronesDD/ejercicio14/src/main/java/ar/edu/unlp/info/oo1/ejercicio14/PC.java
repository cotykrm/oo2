package ar.edu.unlp.info.oo1.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private List<Componente> componentes;

    public PC(){
        componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente c){
        this.componentes.add(c);
    }
    public double calcularConsumo(){
        return this.componentes.stream()
        .mapToDouble(c->c.getConsumo())
        .sum();
    }

    public double calcularPrecio(){
        double precio = this.componentes.stream()
        .mapToDouble(c->c.getPrecio())
        .sum();
        return precio*0.21;
    }

    public List<Componente> getComponentes() {
        return this.componentes;
    }

}
