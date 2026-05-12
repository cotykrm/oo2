package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<AutoEnAlquiler> autosEnAlquiler;

    public Usuario(String nombre){
        autosEnAlquiler = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarAuto(AutoEnAlquiler auto){
        this.autosEnAlquiler.add(auto);
    }
}
