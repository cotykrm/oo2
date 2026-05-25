package ar.edu.unlp.info.oo1.ejercicio23;

import java.time.LocalDate;

public interface IMamifero {

    public String getIdentificador();

    public void setIdentificador(String id);

    public String getEspecie();

    public void setEspecie(String especie);

    public LocalDate getFechaNacimiento();

    public void setFechaNacimiento(LocalDate fechaNacimiento);

    public IMamifero getPadre();

    public void setPadre(IMamifero padre);

    public IMamifero getMadre();

    public void setMadre(IMamifero madre);
    
    public IMamifero getAbueloPaterno();

    public IMamifero getAbuelaPaterna();

    public IMamifero getAbueloMaterno();

    public IMamifero getAbueloMaterno2();

    public IMamifero getAbuelaMaterna();

    public boolean tieneComoAncestroA(IMamifero m);

}
