package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

    private String nombre;
    private LocalDate fechaInicio;
    private String puntoEncuentro; 
    private LocalDate fechaFin;
    private double costo;
    private int cupoMax;
    private int cupoMin;
    private List<Usuario> inscriptos;
    private List<Usuario> listaEspera;
    private EstadoInscripcion estado;

    public Excursion(String nombre, LocalDate fechaInicio, String puntoEncuentro, LocalDate fechaFin, double costo,
            int cupoMax, int cupoMin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.puntoEncuentro = puntoEncuentro;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.cupoMax = cupoMax;
        this.cupoMin = cupoMin;
        this.inscriptos = new ArrayList<>();
        this.listaEspera = new ArrayList<>();
    }

    public void inscribir(Usuario usuario){
        this.estado.inscribir(usuario);
    }

    public String obtenerInformacion(){
        return this.estado.obtenerInformacion();
    }
    


}
