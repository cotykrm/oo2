package ar.edu.unlp.info.oo1.ejercicio2;

public class EmpleadoPlanta extends Empleado{
    private boolean esCasado;
    private int hijos;
    private int antiguedad;

    public EmpleadoPlanta(boolean casado, int hijos, int anti){
        this.esCasado = casado;
        this.hijos = hijos;
        this.antiguedad = anti;
    }

    @Override
    public double getSueldoBasico() {
        return 50000;
    }

    @Override
    public double getSueldoAdicional() {
        double adicional = 2000 * this.antiguedad + 2000 * this.hijos;
        return this.esCasado ? 5000 + adicional: adicional;
    }

       



}
