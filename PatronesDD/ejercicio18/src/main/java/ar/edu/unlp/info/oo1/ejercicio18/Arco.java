package ar.edu.unlp.info.oo1.ejercicio18;

public class Arco implements Arma{

    @Override
    public void atacarA(Personaje defensor) {
        defensor.getArmadura().recibirAtaqueDeArco(defensor);
    }

}
