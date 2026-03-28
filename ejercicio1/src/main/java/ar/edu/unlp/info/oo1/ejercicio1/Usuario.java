package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Usuario {
    private String screenName;
    private List<Tweet> tweets;

    public Usuario(String name){
        this.screenName = name;
        this.tweets = new ArrayList<>();
    }

    public String getScreenName(){
        return this.screenName;
    }

    public void tweetear(String text){
        if(text.length()>0 && text.length()<281){
            Tweet t = new TweetOriginal(text);
            this.tweets.add(t);
        }
    }

    public void reTweetear(TweetOriginal t){
        Tweet rt = new ReTweet(t);
        this.tweets.add(rt); 
    }

    public void borrarRT(Usuario user){
        List<Tweet> aux = this.tweets.stream()
        .filter(tweet->!tweet.soyDe(user))
        .collect(Collectors.toList());
        this.tweets = aux;
        //faltaria solo borrar
    }

    public boolean loContengo(Tweet tweet){
        return this.tweets.contains(tweet);
    }

    // cada usuario deberia saber si contiene un tweet del usuario a borrar, 
    // la pregunta es quien tiene que decir de quien es el rt, porque si un 
    // usuario contiene un t, ya sabemos que es su propio creador, pero si es
    // un rt debo ir al t de origen y pedirle que si su creador es el usuario
    // a eliminar entonces el rt debe borrarse
}
