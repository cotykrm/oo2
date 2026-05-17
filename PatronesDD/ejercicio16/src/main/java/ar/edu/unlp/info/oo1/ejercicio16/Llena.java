package ar.edu.unlp.info.oo1.ejercicio16;

public class Llena extends EstadoInscripcion{

    public Llena(Excursion e){
        super(e);
    }

    @Override
    public void inscribir(Usuario usuario){
        Excursion e = this.getExcursion();
        e.agregarAListaEspera(usuario);

    }

    @Override
    public String obtenerInformacion(){
        return this.getExcursion().toString();        
    }

}
