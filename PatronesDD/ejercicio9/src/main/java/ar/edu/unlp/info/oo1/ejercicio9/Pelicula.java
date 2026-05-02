package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int anioEstreno;
    private List<Pelicula> peliculasSimilares;
    private double puntaje;

    public Pelicula(String titulo, int estreno, double puntaje){
        this.titulo = titulo;
        this.anioEstreno = estreno;
        this.puntaje = puntaje;
        this.peliculasSimilares = new ArrayList<>();
    }

    public void agregarPeliculaSimilar(Pelicula pelicula){
        if(!this.peliculasSimilares.contains(pelicula)){
            this.peliculasSimilares.add(pelicula);
            pelicula.agregarPeliculaSimilar(this);
        }

    }

    public int getAnioEstreno(){
        return this.anioEstreno;
    }

    public double getPuntaje(){
        return this.puntaje;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public List<Pelicula> getSimilares(){
        return this.peliculasSimilares;
    }



}
