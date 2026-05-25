package ar.edu.unlp.info.oo1.ejercicio23;

import java.time.LocalDate;

public class Desconocido implements IMamifero{

    @Override
    public String getIdentificador() {
        return "Desconocido";
    }

    @Override
    public void setIdentificador(String id) {}

    @Override
    public String getEspecie() {
        return "Desconocido";
    }

    @Override
    public void setEspecie(String especie) {}

    @Override
    public LocalDate getFechaNacimiento() {
        return null;
    }

    @Override
    public void setFechaNacimiento(LocalDate fechaNacimiento) {}

    @Override
    public IMamifero getPadre() {
        return this;
    }

    @Override
    public void setPadre(IMamifero padre) {}

    @Override
    public IMamifero getMadre() {
        return this;
    }

    @Override
    public void setMadre(IMamifero madre) {}

    @Override
    public IMamifero getAbueloPaterno() {
        return this;
    }

    @Override
    public IMamifero getAbuelaPaterna() {
        return this;
    }

    @Override
    public IMamifero getAbueloMaterno() {
        return this;
    }

    @Override
    public IMamifero getAbueloMaterno2() {
        return this;
    }

    @Override
    public IMamifero getAbuelaMaterna() {
        return this;
    }

    @Override
    public boolean tieneComoAncestroA(IMamifero m) {
        return false;
    }

    
}
