package ar.edu.unlp.info.oo1.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private static List<Componente> componentes;

    public Catalogo(){
        componentes = new ArrayList<>();
    }

    public static void setCatalogo(List<Componente> c){
        componentes = c;
    }

    public void addComponente(Componente c){
        componentes.add(c); 
    }

    public static Componente getComponente(String description){
        return componentes.stream()
        .filter(comp -> comp.getDescription().equals(description))
        .findFirst()
        .orElse(null);

    }
}
