package ar.edu.unlp.info.oo1.ejercicio16;

public class Definitiva extends EstadoInscripcion {

    public Definitiva(Excursion e){
        super(e);
    }

    @Override 
    public void inscribir(Usuario usuario){
        Excursion e = this.getExcursion();
        e.agregarInscripto(usuario);
        if(e.faltanCupoMax() == 0){
            e.setEstado(new Llena(e));
        }

    }

    @Override 
    public String obtenerInformacion(){
        Excursion e = this.getExcursion();
        return e.toString() + "Faltan para el cupo máximo: " + e.faltanCupoMax() + "\n" 
                            + "Mails de los Usuarios Inscriptos: " + e.mailsDeInscriptos();
    }

}
