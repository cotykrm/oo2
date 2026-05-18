package ar.edu.unlp.info.oo1.ejercicio18;

public class Baston implements Arma{

    @Override
    public void atacarA(Personaje defensor) {
        defensor.getArmadura().recibirAtaqueDeBaston(defensor);
    }

}
