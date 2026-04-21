package ar.edu.unlp.info.oo1.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
empleado temporario
trabajo 0 horas, no esta casado, tiene 0 hijos //1
trabajo 0 horas, no esta casado, tiene 1 hijo //2
trabajo 0 horas, esta casado, tiene 0 hijos //3
trabajo 0 horas, esta casado, tiene 1 hijo //4

trabajo 1 hora, no esta casado, tiene 0 hijos //5
trabajo 1 hora, no esta casado, tiene 1 hijo //6
trabajo 1 hora, esta casado, tiene 0 hijos //7
trabajo 1 hora, esta casado, tiene 1 hijo //8
*/

public class EmpleadoTemporarioTest {
    EmpleadoTemporario em1;
    EmpleadoTemporario em2;
    EmpleadoTemporario em3;
    EmpleadoTemporario em4;
    EmpleadoTemporario em5;
    EmpleadoTemporario em6;
    EmpleadoTemporario em7;
    EmpleadoTemporario em8;


    @BeforeEach
    void setUp(){
        em1 = new EmpleadoTemporario(false, 0, 0);
        em2 = new EmpleadoTemporario(false, 1, 0);
        em3 = new EmpleadoTemporario(true, 0, 0);
        em4 = new EmpleadoTemporario(true, 1, 0);

        em5 = new EmpleadoTemporario(false, 0, 1);
        em6 = new EmpleadoTemporario(false, 1, 1);
        em7 = new EmpleadoTemporario(true, 0, 1);
        em8 = new EmpleadoTemporario(true, 1, 1);
    }

    @Test 
    void sueldoTest(){
        assertEquals(17400, em1.sueldo());
        assertEquals(19300, em2.sueldo());
        assertEquals(22150, em3.sueldo());
        assertEquals(24050, em4.sueldo());

        assertEquals(17661, em5.sueldo());
        assertEquals(19561, em6.sueldo());
        assertEquals(22411, em7.sueldo());
        assertEquals(24311, em8.sueldo());
    }

}

