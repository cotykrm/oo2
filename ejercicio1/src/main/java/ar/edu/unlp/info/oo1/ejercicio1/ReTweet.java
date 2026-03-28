package ar.edu.unlp.info.oo1.ejercicio1;

public class ReTweet extends Tweet{
    private TweetOriginal origen;

    public ReTweet (TweetOriginal org){
        this.origen = org;
    }

    public boolean soyDe(Usuario usuario){
        if(this.origen.soyDe(usuario)){
            return true;
        } 
        if(usuario.loContengo(this)){
            return true;
        }
        return false;
    }
}
