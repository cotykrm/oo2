package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public interface Componente {

    public String prettyPrint();

    public String getNombre();
    public String getExtension();
    public LocalDate getFechaCreacion();
    public LocalDate getFechaModificacion();
    public double getTamanio();
    public String getPermisos();
    //estos los necesito para acceder en cadena a las v.i del componente concreto

}
