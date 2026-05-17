package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

    private String nombre;
    private LocalDate fechaInicio;
    private String puntoEncuentro; 
    private LocalDate fechaFin;
    private int costo;
    private int cupoMax;
    private int cupoMin;
    private List<Usuario> inscriptos;
    private List<Usuario> listaEspera;
    private EstadoInscripcion estado;

    public Excursion(String nombre, LocalDate fechaInicio, String puntoEncuentro, LocalDate fechaFin, int costo,
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
        this.estado = new Provisoria(this);
    }

    public void setEstado(EstadoInscripcion estado){
        this.estado = estado;
    }
    public EstadoInscripcion getEstadoInscripcion(){
        return this.estado;
    }

    public void inscribir(Usuario usuario){
        this.estado.inscribir(usuario);
    }

    public String obtenerInformacion(){
        return this.estado.obtenerInformacion();
    }

    public void agregarInscripto(Usuario usuario){
        this.inscriptos.add(usuario);
    }

    public void agregarAListaEspera(Usuario usuario){
        this.listaEspera.add(usuario);
    }

    public int faltanCuponMin(){
        return this.cupoMin - this.inscriptos.size();
    }

    public int faltanCupoMax(){
        return this.cupoMax - this.inscriptos.size();
    }

    @Override
    public String toString() {
		return "Nombre: " + this.nombre + "\n"
					+ "Costo: " + this.costo + "\n"
					+ "Fecha de Inicio: " + this.fechaInicio + "\n"
					+ "Fecha de Fin: " + this.fechaFin + "\n"
					+ "Punto de Encuentro: " + this.puntoEncuentro + "\n";
	}
	
	public String mailsDeInscriptos() {
		StringBuilder mails = new StringBuilder();
		this.inscriptos.stream()
		.forEach(usuario -> mails.append(usuario.getEmail()).append("\n"));
		return mails.toString();
	}
    


}
