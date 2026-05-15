package ar.edu.unlp.info.oo1.ejercicio15;

public class main {

public static void main (String[] args) {
    String mensaje = "Una dosis más";
    String key = "ysyA";

    FeistelCipherAdapter fc = new FeistelCipherAdapter();
    Mensajero mensajero = new Mensajero(fc);

    mensajero.enviar(mensaje);

    RC4Adapter rc4 = new RC4Adapter(key);
    mensajero.setEstrategiaCifrado(rc4);

    mensajero.enviar(mensaje);






    }

}
