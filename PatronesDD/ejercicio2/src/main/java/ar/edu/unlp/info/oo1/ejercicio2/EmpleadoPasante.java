package ar.edu.unlp.info.oo1.ejercicio2;

public class EmpleadoPasante extends Empleado{
    private int examenesRendidos;

    public EmpleadoPasante(int er){
        this.examenesRendidos = er;
    }

    public double getSueldoBasico(){
        return 20000;
    } 

    public double getSueldoAdicional(){
        return this.examenesRendidos * 2000; 
    }

}
