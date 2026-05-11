package ar.edu.unlp.info.oo1.ejercicio10;

public class Calculadora {
    private StateCalculadora estado;
    private double valorAcumulado;

    public Calculadora(){
        this.reiniciarCalculadora();
    }

    public void setEstado(StateCalculadora estado){
        this.estado = estado;
    }

    public void reiniciarCalculadora(){
        valorAcumulado = 0;
        this.setEstado(new StateCalculadora() {
            
        });
    }

    public String getResultado(){
        
    }

    public void borrar(){

    }

    public void setValor(double unValor){

    }

    public void mas(){

    }

    public void menos(){

    }

    public void por(){

    }

    public void dividido(){

    }

}
