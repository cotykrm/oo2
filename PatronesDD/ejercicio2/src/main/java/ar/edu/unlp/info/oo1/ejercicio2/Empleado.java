package ar.edu.unlp.info.oo1.ejercicio2;

public abstract class Empleado {
    
    public double sueldo(){
        return this.getSueldoBasico() + this.getSueldoAdicional() - this.getDescuento();
    }

    public abstract double getSueldoBasico();

    public abstract double getSueldoAdicional();

    public double getDescuento(){
        return this.getSueldoBasico()*0.13 + this.getSueldoAdicional()*0.05;
    }
}
