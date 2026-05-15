package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;

public class Presupuesto {
    private PC pc;
    private LocalDate fechaCreacion;
    private String nombre;

    public Presupuesto(){}

    public Presupuesto(String nombre, LocalDate fecha){
        this.nombre = nombre;
        this.fechaCreacion = fecha;
    }

    public double calcularConsumo(){
        return this.pc.calcularConsumo();
    }

    public double calcularPrecio(){
        return this.pc.calcularPrecio();
    }

    public LocalDate getFechaCreacion() {
        return this.fechaCreacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    


}
