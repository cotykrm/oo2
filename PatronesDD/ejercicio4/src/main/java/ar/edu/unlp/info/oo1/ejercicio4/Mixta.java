package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Mixta extends Topografia{
    private List<Topografia> topografias;

    public Mixta(){
        this.topografias = new LinkedList<>();
    }

    public void agregarChild(Topografia t){
        if(this.topografias.size() <= 4){
            this.topografias.add(t);
        }
    }


    public List<Topografia> getChildren(){
        return this.topografias;
    }


    public double proporcionAgua(){
        double aux = this.topografias.stream()
        .mapToDouble(topografia -> topografia.proporcionAgua())
        .sum();
        return aux/4;
    }

    public boolean igual(Topografia t){
        return t.compararConMixta(this);
    }

    public boolean compararConMixta(Mixta t){
        return this.topografias.equals(t.getChildren());
    }

    public boolean compararConAgua(Agua t){
        return false;
    }

    public boolean compararConTierra(Tierra t){
        return false;
    }

    public boolean compararConPantano(Pantano t){
        return false;
    }

}
