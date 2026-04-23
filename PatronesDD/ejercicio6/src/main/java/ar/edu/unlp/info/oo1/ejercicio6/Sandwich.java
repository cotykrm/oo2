package ar.edu.unlp.info.oo1.ejercicio6;

public class Sandwich {
    private double pan;
    private double aderezo;
    private double principal;
    private double adicional;

    

    public void setPan(double tipoPan) {
        this.pan = tipoPan;
    }

    

    public void setAderezo(double aderezo) {
        this.aderezo = aderezo;
    }

    

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double calcularPrecio(){
        return this.pan + this.aderezo + this.principal + this.adicional;
    }
    

}
