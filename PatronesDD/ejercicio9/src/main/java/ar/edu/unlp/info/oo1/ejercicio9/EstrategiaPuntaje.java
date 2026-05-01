package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;

public class EstrategiaPuntaje extends EstrategiaSugerencia{

    @Override
    public List<Pelicula> sugerir(Decodificador deco) {
        return deco.getGrilla().stream()
        .sorted(Comparator.comparingInt(Pelicula::getPuntaje).reversed()
            .thenComparing(Pelicula::getAnioEstreno, Comparator.reverseOrder()))        
        .limit(3)
        .toList();
        
    }

}
