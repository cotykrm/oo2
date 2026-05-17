package ar.edu.unlp.info.oo1.ejercicio16;

public class Provisoria extends EstadoInscripcion{

    public Provisoria(Excursion e){
        super(e);
    }

    @Override
    public void inscribir(Usuario usuario) {
        Excursion e = this.getExcursion();
        e.agregarInscripto(usuario);
        if(e.faltanCuponMin() == 0){
            e.setEstado(new Definitiva(e));
        }

    }

    @Override
    public String obtenerInformacion(){
        Excursion e = this.getExcursion();
        return e.toString() + "Faltan para el cupo mínimo: " + e.faltanCuponMin();

    }

}
