package ar.edu.unlp.info.oo1.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Componente> componentes;

    public Catalogo(){
        componentes = new ArrayList<>();
    }

    public void addComponente(Componente c){
        this.componentes.add(c); 
    }

    public Componente getComponente(String description){
        return this.componentes.stream()
        .filter(comp -> comp.getDescription().equals(description))
        .findFirst()
        .orElse(null);

    }
}
