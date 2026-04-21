package ar.edu.unlp.info.oo1.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*empleado planta

no esta casado, tiene 0 hijos, tiene 0 antiguedad
no esta casado, tiene 1 hijo, tiene 0 antiguedad
no esta casado, tiene 0 hijos, tiene 1 antiguedad
no esta casado, tiene 1 hijo, tiene 1 antiguedad

esta casado, tiene 0 hijos, tiene 0 antiguedad
esta casado, tiene 1 hijo, tiene 0 antiguedad
esta casado, tiene 0 hijos, tiene 1 antiguedad
esta casado, tiene 1 hijo, tiene 1 antiguedad
*/

public class EmpleadoPlantaTest {
    EmpleadoPlanta em1;
    EmpleadoPlanta em2;
    EmpleadoPlanta em3;
    EmpleadoPlanta em4;
    EmpleadoPlanta em5;
    EmpleadoPlanta em6;
    EmpleadoPlanta em7;
    EmpleadoPlanta em8;

    @BeforeEach
    void setUp(){
        em1 = new EmpleadoPlanta(false, 0, 0);
        em2 = new EmpleadoPlanta(false, 1, 0);
        em3 = new EmpleadoPlanta(false, 0, 1);
        em4 = new EmpleadoPlanta(false, 1, 1);

        em5 = new EmpleadoPlanta(true, 0, 0);
        em6 = new EmpleadoPlanta(true, 1, 0);
        em7 = new EmpleadoPlanta(true, 0, 1);
        em8 = new EmpleadoPlanta(true, 1, 1);

    }

    @Test
    void sueldoTest(){
        assertEquals(43500, em1.sueldo());
        assertEquals(45400, em2.sueldo());
        assertEquals(45400, em3.sueldo());
        assertEquals(47300, em4.sueldo());

        assertEquals(48250, em5.sueldo());
        assertEquals(50150, em6.sueldo());
        assertEquals(50150, em7.sueldo());
        assertEquals(52050, em8.sueldo());
    }

}
