package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.ArrayList;
public class Perfil {
   private boolean verificado;
   private ArrayList<Publicacion> publicaciones;
   
   public Perfil(boolean verificado) {
        this.verificado = verificado;
        this.publicaciones = new ArrayList<>();
   }
   public void agregarPublicacion(Publicacion publicacion) { 
	   publicaciones.add(publicacion); 
   }
   
   private int bonus() { return verificado ? 2 : 1; }
   
   private int alcanceDePublicaciones() {
       return publicaciones.stream().mapToInt(p -> p.alcance()).sum();
   }
   
   public int alcance() {
       return alcanceDePublicaciones() * bonus();
   }
   
   //Rename method: calcular (referenciado en línea 15 de Perfil.java) por alcance
   //Rename parameter: el parámetro “p” del método agregarPublicacion (línea 10 de Perfil.java) por “publicacion”


}

