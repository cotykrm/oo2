package ar.edu.unlp.info.oo1.ejercicio18;

public class ArmaduraDeCuero implements Armadura{

    public void recibirAtaqueDeEspada(Personaje defensor){
        int vida = defensor.getVida();
        defensor.setVida(vida - 8);


    }
    public void recibirAtaqueDeArco(Personaje defensor){
        int vida = defensor.getVida();
        defensor.setVida(vida - 5);


    }

    public void recibirAtaqueDeBaston(Personaje defensor){
        int vida = defensor.getVida();
        defensor.setVida(vida - 2);

        
    }

}
