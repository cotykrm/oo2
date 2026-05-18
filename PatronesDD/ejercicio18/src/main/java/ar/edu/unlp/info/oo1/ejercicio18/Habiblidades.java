package ar.edu.unlp.info.oo1.ejercicio18;

import java.util.ArrayList;
import java.util.List;

public class Habiblidades {
    private List<String> habilidades;
    
    public Habiblidades(){
        this.habilidades = new ArrayList<>();
    }

    public void agregarHabilidad(String habilidad){
        this.habilidades.add(habilidad);
    }

}
