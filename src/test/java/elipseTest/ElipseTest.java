package elipseTest;

import elipse.Elipse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElipseTest {

    private Elipse elipse = null;
    private Elipse elipso = null;

    @Before
    public void init() {
        elipse = new Elipse("elipseUno", 3,4);
        elipso = new Elipse(2, 3);
    }


    @Test
    public void getMenorTest() {
        assertEquals(3, elipse.getMenor(), 0.0);
        assertEquals(2, elipso.getMenor(), 0.0);
    }

    @Test
    public void getMayorTest() {
        assertEquals(4, elipse.getMayor(), 0.0);
        assertEquals(3, elipso.getMayor(), 0.0);
    }

    @Test
    public void getNombre() {
        assertEquals("elipseUno", elipse.getNombre());
        assertEquals("desconocido", elipso.getNombre());
    }

    @Test
    public void areaTest() {
        assertEquals(37.70, elipse.area(), 0.1);
        assertEquals(18.85, elipso.area(), 0.1);
    }
}
