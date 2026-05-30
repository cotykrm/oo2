package ar.edu.unlp.info.oo1.ejercicio25;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.PlainDocument;

public class Afiliado {

    private String nombre;
    private int familiaresACargo;
    private double salario;
    private LocalDate fechaNecimiento;
    private List<PlanMedico> previos;
    private PlanMedico plan;
    private Coseguro coseguro;

    public Afiliado(String nombre, int familiaresACargo, double salario, 
        LocalDate fechaNecimiento, Coseguro coseguro, PlanMedico plan) {
        this.nombre = nombre;
        this.familiaresACargo = familiaresACargo;
        this.salario = salario;
        this.fechaNecimiento = fechaNecimiento;
        this.coseguro = coseguro;
        this.previos = new ArrayList<>();
        this.setPlan(plan);
    }

    public int getEdad(){
        return ChronoUnit.YEARS.between(fechaNecimiento, LocalDate.now());
    }


    public void setPlan(PlanMedico plan) {
        this.plan = plan;
    }



    public String getNombre() {
        return this.nombre;
    }

    public int getFamiliaresACargo() {
        return this.familiaresACargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public LocalDate getFechaNecimiento() {
        return this.fechaNecimiento;
    }

    public List<PlanMedico> getPrevios() {
        return this.previos;
    }

    public PlanMedico getPlan() {
        return this.plan;
    }

    public Coseguro getCoseguro() {
        return this.coseguro;
    }

    


}
