package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
    Usuario u1;
    Usuario u2;
    Usuario u3;
    EstadoInscripcion estado;
    Excursion provisoria;
    Excursion definitiva;
    Excursion llena;

    @BeforeEach
    void setUp(){
        u1 = new Usuario("krm", "mati", "maty@gmail.com");
        u2 = new Usuario("krm", "coty", "coty@gmial.com");
        u3 = new Usuario("rus", "clau", "clau@gmail.com");

        provisoria = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2026, 06, 16) , 
        "Mi casa", LocalDate.of(2026, 06, 18), 2000, 2, 1);

        definitiva = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2026, 06, 16) , 
        "Mi casa", LocalDate.of(2026, 06, 18), 2000, 2, 1);

        definitiva.inscribir(u1);

        llena = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2026, 06, 16) , 
        "Mi casa", LocalDate.of(2026, 06, 18), 2000, 2, 1);
        
        llena.inscribir(u1);
        llena.inscribir(u2);

        
    }

    @Test
    void testInscribirProvisoria(){
        assertTrue(provisoria.getEstadoInscripcion() instanceof Provisoria);

        provisoria.inscribir(u1);
        assertTrue(provisoria.getEstadoInscripcion() instanceof Definitiva);
    }

    @Test
    void testObtenerInformacionProvisoria(){
        String resultado = "Nombre: " + "Dos días en kayak bajando el Paraná" + "\n"
					+ "Costo: " + 2000 + "\n"
					+ "Fecha de Inicio: " + "2026-06-16" + "\n"
					+ "Fecha de Fin: " + "2026-06-18" + "\n"
					+ "Punto de Encuentro: " + "Mi casa" + "\n"
                    + "Faltan para el cupo mínimo: " + 1;
        assertEquals(resultado, provisoria.obtenerInformacion());
    }

    @Test
    void testInscribirDefinitiva(){
        assertTrue(definitiva.getEstadoInscripcion() instanceof Definitiva);

        definitiva.inscribir(u2);
        assertTrue(definitiva.getEstadoInscripcion() instanceof Llena);
    }

    @Test
    void testObtenerInformacionDefinitiva(){
        String resultado = "Nombre: " + "Dos días en kayak bajando el Paraná" + "\n"
					+ "Costo: " + 2000 + "\n"
					+ "Fecha de Inicio: " + "2026-06-16" + "\n"
					+ "Fecha de Fin: " + "2026-06-18" + "\n"
					+ "Punto de Encuentro: " + "Mi casa" + "\n"
                    + "Faltan para el cupo máximo: " + 1 + "\n"
                    + "Mails de los Usuarios Inscriptos: "
                    + "maty@gmail.com" + "\n";
        assertEquals(resultado, definitiva.obtenerInformacion());
    }

    @Test
    void testInscribirLlena(){
        assertTrue(llena.getEstadoInscripcion() instanceof Llena);

        llena.inscribir(u3);
        assertTrue(llena.getEstadoInscripcion() instanceof Llena);
    }
    
    @Test
    void testObtenerInformacionLlena(){
        String resultado = "Nombre: " + "Dos días en kayak bajando el Paraná" + "\n"
					+ "Costo: " + 2000 + "\n"
					+ "Fecha de Inicio: " + "2026-06-16" + "\n"
					+ "Fecha de Fin: " + "2026-06-18" + "\n"
					+ "Punto de Encuentro: " + "Mi casa" + "\n";
                    
        assertEquals(resultado, llena.obtenerInformacion());
    }

}
