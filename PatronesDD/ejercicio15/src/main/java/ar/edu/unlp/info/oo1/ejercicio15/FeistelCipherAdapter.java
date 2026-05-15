package ar.edu.unlp.info.oo1.ejercicio15;

public class FeistelCipherAdapter implements EstrategiaCifrado{
    private FeistelCipher algoritmo; 

    @Override
    public void enviar(String mensaje){
        this.algoritmo = new FeistelCipher(mensaje);
        this.algoritmo.encode(mensaje);
        //System.out.println(mensaje);
    }

    @Override
    public void recibir(String mensaje){
        this.algoritmo.encode(mensaje);
    }

}
