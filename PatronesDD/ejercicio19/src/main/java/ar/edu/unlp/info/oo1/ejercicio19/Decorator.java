package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public abstract class Decorator implements Componente{

    private Componente componente;

    public Decorator(Componente componente){
        this.componente = componente;
    }

    public Componente getComponente(){
        return this.componente;
    }

    @Override
    public String getNombre() {
        return this.getComponente().getNombre();
    }

    @Override
    public String getExtension() {
        return this.getComponente().getExtension();
    }

    @Override
    public LocalDate getFechaCreacion() {
        return this.getComponente().getFechaCreacion();
    }

    @Override
    public LocalDate getFechaModificacion() {
        return this.getComponente().getFechaModificacion();
    }

    @Override
    public double getTamanio() {
        return this.getComponente().getTamanio();
    }

    @Override
    public String getPermisos() {
        return this.getComponente().getPermisos();
    }

}
