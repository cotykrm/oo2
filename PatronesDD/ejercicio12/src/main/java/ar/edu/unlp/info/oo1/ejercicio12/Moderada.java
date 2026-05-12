package ar.edu.unlp.info.oo1.ejercicio12;

public class Moderada implements Estrategia{

    @Override
    public double calcularReembolso(double monto, int cantDias) {
        if(cantDias >= 7){
            return monto;
        }
        else if(cantDias >=2){
            return monto * 0.5;
        }
        return 0;
    }

}
