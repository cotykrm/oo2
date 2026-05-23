package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComponenteTest {

    Componente archivo;
    Componente capa1;
    Componente capa2;
    Componente capa3;
    Componente archivoConfigurado;

    @BeforeEach
    void setUp(){
        archivo = new Fileoo2("notas", "txt", 500, LocalDate.of(2026, 5, 25), LocalDate.now(), "rw-");

        // 2. Primera capa: queremos que primero se procese el nombre
        capa1 = new DecoratorNombre(archivo);

        // 3. Segunda capa: envolvemos lo anterior para agregar la fecha
        capa2 = new DecoratorFechaCreacion(capa1);

        capa3 = new DecoratorTamanio(capa2);

        // 4. Capa final (la más externa): envolvemos todo con la extensión
        archivoConfigurado = new DecoratorExtension(capa3);
    }

    @Test
    void prettyPrintTest(){
        String resultado = " - notas - 2026-05-25 - 500.0 - txt";
        assertEquals(resultado, archivoConfigurado.prettyPrint());
    }

}
