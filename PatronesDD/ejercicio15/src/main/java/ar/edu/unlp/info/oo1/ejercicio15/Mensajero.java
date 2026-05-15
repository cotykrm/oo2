package ar.edu.unlp.info.oo1.ejercicio15;

public class Mensajero {
    private EstrategiaCifrado estrategia;
    
    public Mensajero(EstrategiaCifrado e){
        this.estrategia = e;
    }

    public void setEstrategiaCifrado(EstrategiaCifrado e){
        this.estrategia = e;
    }

    public void enviar(String mensaje){
        this.estrategia.enviar(mensaje);
    }

    public void recibir(String mensaje){
        this.estrategia.recibir(mensaje);
    }

}
