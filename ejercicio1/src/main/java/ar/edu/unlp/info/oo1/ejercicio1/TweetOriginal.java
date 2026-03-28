package ar.edu.unlp.info.oo1.ejercicio1;

public class TweetOriginal extends Tweet{
    private String texto;
    //private String creador;

        public TweetOriginal(String text){
            this.texto = text;
        }

        public boolean soyDe(Usuario user){
            return user.loContengo(this);
        }




}
