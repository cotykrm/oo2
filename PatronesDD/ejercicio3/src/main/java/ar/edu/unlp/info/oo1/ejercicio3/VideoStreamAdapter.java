package ar.edu.unlp.info.oo1.ejercicio3;

public class VideoStreamAdapter extends Media{
    
    private VideoStream adaptee;

    public void play(){
        adaptee.reproduce();
    }

}
