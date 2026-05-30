package ar.edu.unlp.info.oo1.ejercicio25;

import java.time.LocalDate;

public abstract class PlanMedico {
    private LocalDate fechaContratacion;

    public double calcularCostoMensual(){
        return montoFijo + cargoPorGrupoFamiliar + coberturaViajera + adicionalInternacion;
    }
}
