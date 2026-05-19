package ar.edu.unlp.info.oo1.ejercicio18;

public class Martillo implements Arma{

    @Override
    public void atacarA(Personaje defensor) {
        defensor.getArmadura().recibirAtaqueDeMartillo(defensor);
    }

}
