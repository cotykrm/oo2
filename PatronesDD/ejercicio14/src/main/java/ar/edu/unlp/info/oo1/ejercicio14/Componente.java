package ar.edu.unlp.info.oo1.ejercicio14;

public class Componente {
    private String nombre;
    private String description;
    private double precio;
    private double consumo;

    public Componente (String nombre, String des, double precio, double consumo){
        this.nombre = nombre;
        this.description = des;
        this.precio = precio;
        this.consumo = consumo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrecio() {
        return this.precio;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    
}
