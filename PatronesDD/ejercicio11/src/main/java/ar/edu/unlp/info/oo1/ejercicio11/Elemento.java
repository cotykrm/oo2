package ar.edu.unlp.info.oo1.ejercicio11;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
    private String nombre;
    private LocalDate fechaCreacion;

    public Elemento(String nombre){
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
    }

    public String getNombre(){
        return this.nombre;
    }
    public boolean mismoNombre(String n){
        return this.getNombre().equals(n);
    }

    public LocalDate fechaCreacion(){
        return this.fechaCreacion;
    }

    public abstract int tamanoTotalOcupado();

    public abstract Archivo archivoMasGrande();

    public abstract Archivo archivoMasNuevo();

    public abstract Elemento buscar(String nombre);

    public List<Elemento> buscarTodos(String nombre, List<Elemento> lista){
        if(this.mismoNombre(nombre))
            lista.add(this);
        this.buscarT(nombre,lista);
        return lista;
    }

    protected abstract void buscarT(String nombre, List<Elemento> lista);

    public String listadoContenido(String aux){
        aux += "/" + this.getNombre();
        if(!this.mismoNombre(getNombre())){
            this.toString(aux);
        }
        return aux;
    }

    protected abstract void toString(String str);


    
  


}
