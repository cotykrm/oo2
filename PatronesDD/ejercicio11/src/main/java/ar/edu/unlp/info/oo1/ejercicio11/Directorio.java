package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Elemento{
    private List<Elemento> contenido;

    public Directorio(String nombre){
        super(nombre);
        this.contenido = new ArrayList<>();

    }

    public boolean mismoNombre(String n){
        return this.getNombre().equals(n);
    }

    public void agregarElemento(Elemento e) {
		this.contenido.add(e);
	}

    @Override
    public int tamanoTotalOcupado() {
        return this.contenido.stream()
        .mapToInt(c -> c.tamanoTotalOcupado())
        .sum() + 32;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this.contenido.stream()
        .map(elem -> elem.archivoMasGrande())
        .max((archivo1, archivo2) -> Integer.compare(archivo1.tamanoTotalOcupado(), archivo2.tamanoTotalOcupado())) 
        .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.contenido.stream()
        .map(elem -> elem.archivoMasNuevo())
        .max((archivo1, archivo2) -> archivo1.fechaCreacion().compareTo(archivo2.fechaCreacion())) 
        .orElse(null);
    }

    @Override
    public Elemento buscar(String nombre) {
        if(this.mismoNombre(nombre)){
            return this;
        }
        return this.contenido.stream()
        .map(e->e.buscar(nombre))
        .filter(elemento -> elemento != null).findFirst().orElse(null);
    }

    @Override
    protected void buscarT(String nombre, List<Elemento> lista){
        this.contenido.stream()
        .forEach(e->e.buscarTodos(nombre,lista));
    }

    protected void toString(String str){
        this.contenido.stream()
        .forEach(e->e.listadoContenido(str));
    }
}
