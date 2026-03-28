package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Red {
    private List<Usuario> usuarios;

    public Red(){
        this.usuarios = new LinkedList<>();
    }
    
    public void crearUsuario(String name){
        if(!existeUser(name)){
            Usuario nuevo = new Usuario(name);
            this.usuarios.add(nuevo);
        } else {
            System.out.println("ScreenName ya existente");
        }
    }

    public boolean existeUser(String name){
        return usuarios.stream()
        .anyMatch(usuario->usuario.getScreenName().equals(name));
    }

    public void eliminarUsuario(Usuario u){
        this.usuarios.stream()
        .forEach(usuario->usuario.borrarRT(u));
        this.usuarios.remove(u);
    }

}
