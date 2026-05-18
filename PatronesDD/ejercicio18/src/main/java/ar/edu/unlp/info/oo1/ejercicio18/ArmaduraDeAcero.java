package ar.edu.unlp.info.oo1.ejercicio18;

public class ArmaduraDeAcero implements Armadura{

    public void recibirAtaqueDeEspada(Personaje defensor){
        int vida = defensor.getVida();
        defensor.setVida(vida - 3);

    }
    public void recibirAtaqueDeArco(Personaje defensor){
        int vida = defensor.getVida();
        defensor.setVida(vida - 2);


    }

    public void recibirAtaqueDeBaston(Personaje defensor){
        int vida = defensor.getVida();
        defensor.setVida(vida - 1);

        
    }

}
