package cuadradoTest;

import cuadrado.Cuadrado;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuadradoTest {

    private Cuadrado cuadrado = null;
    private Cuadrado quadrat = null;

    @Before
    public void init() {

        cuadrado = new Cuadrado("cuadradoUno", 3);
        quadrat = new Cuadrado(5);
    }

    @Test
    public void getLadoTest() {
        assertEquals(3, cuadrado.getLado(), 0.0);
        assertEquals(5, quadrat.getLado(), 0.0);
    }

    @Test
    public void areaTest() {
        assertEquals(9, cuadrado.area(), 0.0);
        assertEquals(25, quadrat.area(), 0.0);
    }

    @Test
    public void getNombreTest() {
        assertEquals("cuadradoUno", cuadrado.getNombre());
        assertEquals("desconocido", quadrat.getNombre());
    }
}
