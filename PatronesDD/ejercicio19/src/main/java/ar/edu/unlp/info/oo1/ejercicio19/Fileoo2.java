package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Fileoo2 implements Componente{
    private String nombre;
    private String extension;
    private double tamanio;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String permisos;

    public Fileoo2(String nombre, String extension, double tamanio, LocalDate fechaCreacion,
            LocalDate fechaModificacion, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getExtension() {
        return extension;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    @Override
    public String getPermisos() {
        return permisos;
    }
    
    @Override
    public String prettyPrint(){
        return this.nombre;
    }
}
