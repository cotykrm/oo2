package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.LinkedList;
import java.util.List;

public class FileSystem {

    private Directorio root;

    public FileSystem(Directorio root){
        this.root = root;
    }

    public void agregarElemento(Elemento e){
        this.root.agregarElemento(e);
    }


        /**
     * Retorna el espacio total ocupado, incluyendo todo su contenido.
     */
    public int tamanoTotalOcupado(){
        return this.root.tamanoTotalOcupado();
    }

    /**
     * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
     * filesystem 
     */
    public Archivo archivoMasGrande(){
        return this.root.archivoMasGrande();
    }

    /**
     * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
     * del filesystem
     */
    public Archivo archivoMasNuevo(){
        return this.root.archivoMasNuevo();
    }

    /**
     * Retorna el primer elemento con el nombre solicitado contenido en cualquier
     * nivel del filesystem
     */
    public Elemento buscar(String nombre){
        return this.root.buscar(nombre);
    }

    /**
         * Retorna la lista con los elementos que coinciden con el nombre solicitado 
     * contenido en cualquier nivel del filesystem
     */
    public List<Elemento> buscarTodos(String nombre){
        List<Elemento> encontrados = new LinkedList<>();
        return this.root.buscarTodos(nombre,encontrados);
    }

    /**
     * Retorna un String con los nombres de los elementos contenidos en todos los 
     * niveles del filesystem. De cada elemento debe retornar el path completo
     * (similar al comando pwd de linux) siguiendo el modelo presentado a
     * continuación
            /Directorio A
            /Directorio A/Directorio A.1
            /Directorio A/Directorio A.1/Directorio A.1.1
            /Directorio A/Directorio A.1/Directorio A.1.2 	
            /Directorio A/Directorio A.2
            /Directorio B
    */
    public String listadoDeContenido(){
        String aux = "";
        return this.root.listadoContenido(aux);
    }
}
