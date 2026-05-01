package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> grilla;
    private List<Pelicula> reproducidas;
    private EstrategiaSugerencia estrategia;

    public Decodificador(){
        this.grilla = new ArrayList<>();
        this.reproducidas = new ArrayList<>();
    }

    public void setEstrategia(EstrategiaSugerencia estrategia){
        this.estrategia = estrategia;
    }

    public List<Pelicula> sugerir(){
        return this.estrategia.sugerir(this);
    }

    public void reproducirPelicula(Pelicula pelicula){
        this.reproducidas.add(pelicula);
    }

    public void agregarAGrilla(Pelicula pelicula){
        this.grilla.add(pelicula);
    }

    public List<Pelicula> getGrilla(){
        return this.grilla;
    }

    public List<Pelicula> getReproducidas(){
        return this.reproducidas;
    }

    public boolean seReprodujo(Pelicula pelicula){
        return this.reproducidas.contains(pelicula);
    }
}


