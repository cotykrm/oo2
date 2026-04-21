package ar.edu.unlp.info.oo1.ejercicio6_1;

public abstract class Empleado {
	protected String nombre;
	protected String apellido;
	protected double sueldoBasico = 0;
	
	public double calcularSueldo() {
		return this.sueldoBasico - (this.sueldoBasico * 0.13);
	}
}
