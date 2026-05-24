package ar.edu.unlp.info.oo1.ejercicio20;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {

    DatabaseProxy proxy;
    DatabaseRealAccess db;
    String contrasenia;
    String contraseniaMal;

    @BeforeEach
    void setUp(){
        contrasenia = "corazon";
        contraseniaMal = "dembow";
        db = new DatabaseRealAccess();
        proxy = new DatabaseProxy(db, contrasenia); 

    }

    @Test
    void iniciarSesionCorrectamenteTest(){
        assertFalse(proxy.getAcceso());
        proxy.iniciarSesion(contrasenia);
        assertTrue(proxy.getAcceso());
    }

    @Test
    void iniciarSesionIncorrectamenteTest(){
        assertFalse(proxy.getAcceso());
        Exception exception = assertThrows(RuntimeException.class, () -> 
            proxy.iniciarSesion(contraseniaMal));
        assertEquals("Contraseña incorrecta", exception.getMessage());
        assertFalse(proxy.getAcceso());
    }

    @Test
    void iniciarSesionDosVecesTest(){
        assertFalse(proxy.getAcceso());
        proxy.iniciarSesion(contrasenia);
        assertTrue(proxy.getAcceso());
        Exception exception = assertThrows(RuntimeException.class, () -> 
            proxy.iniciarSesion(contrasenia));
        assertEquals("Sesión ya iniciada", exception.getMessage());
        assertTrue(proxy.getAcceso());
    }

    @Test
    void cerrarSesionCorrectamenteTest(){
        assertFalse(proxy.getAcceso());
        proxy.iniciarSesion(contrasenia);
        assertTrue(proxy.getAcceso());
        proxy.cerrarSesion();
        assertFalse(proxy.getAcceso());
    }

    @Test
    void cerrarSesionInorrectamenteTest(){
        assertFalse(proxy.getAcceso());
        Exception exception = assertThrows(RuntimeException.class, () -> 
            proxy.cerrarSesion());
        assertEquals("Sesión no iniciada", exception.getMessage());
    }

    @Test 
    void getSearchResultsSesionIniciadaTest(){
        proxy.iniciarSesion(contrasenia);
        assertTrue(proxy.getAcceso());
        Collection<String> resultado = proxy.getSearchResults("select * from comics where id=1");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), resultado);
    }

    
    @Test
    void getSearchResultsSesionNoIniciadaTest(){
        assertFalse(proxy.getAcceso());
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            proxy.getSearchResults("select * from comics where id=1"));
        assertEquals("Sesión no iniciada", exception.getMessage());  

    }

    @Test
    void insertNewRowSesionIniciadaTest(){
        proxy.iniciarSesion(contrasenia);
        assertTrue(proxy.getAcceso());
        int id = proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        assertEquals(3, id);
        Collection<String> resultado = proxy.getSearchResults("select * from comics where id=3");
        assertEquals(Arrays.asList("Patoruzú", "La flor"), resultado);

    }

    @Test
    void insertNewRowSesionNoIniciadaTest(){
        assertFalse(proxy.getAcceso());
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals("Sesión no iniciada", exception.getMessage());
    }


}
