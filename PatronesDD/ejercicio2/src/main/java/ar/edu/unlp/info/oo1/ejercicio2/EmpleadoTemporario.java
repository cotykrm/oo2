package ar.edu.unlp.info.oo1.ejercicio2;

public class EmpleadoTemporario extends Empleado {
    private boolean esCasado;
    private int hijos;
    private int horasTrabajadas;
    
    public EmpleadoTemporario(boolean casado, int hijos, int ht){
        this.esCasado = casado;
        this.hijos = hijos;
        this.horasTrabajadas = ht;
    }

    public double getSueldoBasico(){
        return 20000 + this.horasTrabajadas * 300;
    }

    public double getSueldoAdicional(){
        double adicional = this.hijos * 2000;
        return this.esCasado ? 5000 + adicional: adicional;
    }
}