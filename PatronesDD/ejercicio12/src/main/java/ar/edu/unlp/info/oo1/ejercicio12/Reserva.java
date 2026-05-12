package ar.edu.unlp.info.oo1.ejercicio12;

import java.time.LocalDate;

public class Reserva {
    private int cantDias;
    private LocalDate fechaInicio; 
    private AutoEnAlquiler auto;
    private Usuario conductor;

    public Reserva(int cantDias, LocalDate fechaI, 
        AutoEnAlquiler auto, Usuario conductor){
        this.cantDias = cantDias;
        this.fechaInicio = fechaI;
        this.auto = auto;
        this.conductor = conductor;
    }

    public double montoAPagar(){
        return this.auto.getPrecioPorDia() * this.cantDias;
    }

    public double AReembolsar(){
        return this.auto.getEstrategia().calcularReembolso(this.montoAPagar(),this.cantDias);
    }

}
