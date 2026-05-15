package ar.edu.unlp.info.oo1.ejercicio15;

public class RC4Adapter implements EstrategiaCifrado{
    private RC4 algoritmo = new RC4();
    private String key;

    public RC4Adapter(String key){
        this.key = key;
    }

    @Override
    public void enviar(String mensaje){
        algoritmo.encriptar(mensaje, this.key);
    }

    @Override
    public void recibir(String mensaje){
        algoritmo.desencriptar(mensaje, this.key);
    }
}
