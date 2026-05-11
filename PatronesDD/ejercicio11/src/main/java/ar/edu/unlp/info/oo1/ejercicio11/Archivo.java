package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.List;

public class Archivo extends Elemento{
    private int tamanio;

    public Archivo(String nombre, int tamanio){
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.tamanio;

    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    @Override
    public Elemento buscar(String nombre) {
        if(this.mismoNombre(nombre)){
            return this;
        }
        return null;
    }
    @Override
    protected void buscarT(String nombre, List<Elemento> lista){}

    @Override
    protected void toString(String str) {}

    

}
