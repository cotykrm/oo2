package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
    Decodificador decodificador;

    Pelicula p1;
    Pelicula p2;
    Pelicula p3;
    Pelicula p4;
    Pelicula p5;
    Pelicula p6;

    @BeforeEach
    void setUp(){
        decodificador = new Decodificador();
        p1 = new Pelicula("Thor", 2016, 7.9);
        p2 = new Pelicula("Capitan America", 2016, 7.8);
        p3 = new Pelicula("Iron man", 2010, 7.9);
        p4 = new Pelicula("Dunkirk", 2017, 7.9);
        p5 = new Pelicula("Rocky", 1976, 8.1);
        p6 = new Pelicula("Rambo", 1979, 7.8);

        p1.agregarPeliculaSimilar(p2);
        p1.agregarPeliculaSimilar(p3);
        p5.agregarPeliculaSimilar(p6);

        decodificador.agregarAGrilla(p1);
        decodificador.agregarAGrilla(p2);
        decodificador.agregarAGrilla(p3);
        decodificador.agregarAGrilla(p4);
        decodificador.agregarAGrilla(p5);
        decodificador.agregarAGrilla(p6);
        
        decodificador.reproducirPelicula(p1);
        decodificador.reproducirPelicula(p5);

        

    }

    @Test
    void sugerirSimilarTest(){
        EstrategiaSugerencia similar = new EstrategiaSimilar();
        decodificador.setEstrategia(similar);

        List<Pelicula> similares = decodificador.sugerir();

        assertTrue(similares.contains(p2));
        assertTrue(similares.contains(p3));
        assertTrue(similares.contains(p6)); //esta no es similar a la primer pelicula, para el primer similar, falla

    }

    @Test
    void sugerirPuntajeTest(){
        EstrategiaSugerencia puntaje = new EstrategiaPuntaje();
        decodificador.setEstrategia(puntaje);

        List<Pelicula> puntajes = decodificador.sugerir();

        assertTrue(puntajes.contains(p4));
        assertTrue(puntajes.contains(p3));
        assertTrue(puntajes.contains(p2));
    }
}
