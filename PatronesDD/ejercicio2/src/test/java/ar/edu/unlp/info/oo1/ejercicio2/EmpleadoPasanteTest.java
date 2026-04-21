package ar.edu.unlp.info.oo1.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//empelado pasante
// rindió 0 exámenes 
// rindió 1 examen

public class EmpleadoPasanteTest {
    EmpleadoPasante emple0Ex;
    EmpleadoPasante emple1Ex;

    @BeforeEach
    void setUp(){
        emple0Ex = new EmpleadoPasante(0);
        emple1Ex = new EmpleadoPasante(1);
    }

    @Test
    void sueldoTest(){
        assertEquals(17400, emple0Ex.sueldo());
        assertEquals(19300, emple1Ex.sueldo());

    }
}

