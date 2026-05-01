package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.List;

public class EstrategiaNovedad extends EstrategiaSugerencia{

    public List<Pelicula> sugerir(Decodificador deco){
        return deco.getGrilla().stream()
        .sorted((p1,p2) -> Integer.compare(p1.getAnioEstreno(), p2.getAnioEstreno()))
        .limit(3)
        .toList();
    }

}
