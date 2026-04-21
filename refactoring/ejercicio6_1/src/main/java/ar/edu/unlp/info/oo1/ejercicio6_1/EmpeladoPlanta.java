package ar.edu.unlp.info.oo1.ejercicio6_1;

public class EmpeladoPlanta extends Empleado{
    private int cantidadHijos = 0;

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (this.cantidadHijos * 2000);
    }
}
