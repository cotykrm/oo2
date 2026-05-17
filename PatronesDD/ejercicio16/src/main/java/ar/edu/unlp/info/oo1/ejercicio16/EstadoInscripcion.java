package ar.edu.unlp.info.oo1.ejercicio16;

public abstract class EstadoInscripcion {
    private Excursion excursion;

    public EstadoInscripcion(Excursion e){
        this.excursion = e;
    }

    public Excursion getExcursion(){
        return this.excursion;
    }

    public abstract void inscribir(Usuario usuario);

    public abstract String obtenerInformacion();

}
