package ar.edu.unlp.info.oo1.ejercicio6_1;

public class EmpleadoTemporario extends Empleado{
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    
	
	
	@Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (this.cantidadHijos * 1000) + (this.horasTrabajadas * 500);
    }

}
