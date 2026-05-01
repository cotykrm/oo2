package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.List;

public class EstrategiaSimilar extends EstrategiaSugerencia{

    public List<Pelicula> sugerir(Decodificador deco){
        Pelicula aux = deco.getReproducidas().get(0);
        return aux.getSimilares().stream()
        .sorted((p1,p2) -> Integer.compare(p1.getAnioEstreno(), p2.getAnioEstreno()))
        .limit(3)
        .toList();
    }

}
