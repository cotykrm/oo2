package ar.edu.unlp.info.oo1.ejercicio25;

public class Coseguro {
    private String nombre;
    private int descuento;
    private LocalDate fechaIngreso;
    private double montoCoberturaViajes;
    public Coseguro(String nombre, int descuento, LocalDate fechaIngreso, double montoCoberturaViajes) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.fechaIngreso = fechaIngreso;
        this.montoCoberturaViajes = montoCoberturaViajes;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getDescuento() {
        return this.descuento;
    }
    public LocalDate getFechaIngreso() {
        return this.fechaIngreso;
    }
    public double getMontoCoberturaViajes() {
        return this.montoCoberturaViajes;
    }

    

}
