package circulo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CirculoTest {

    private Circulo circulo = null;
    private Circulo cercle = null;

    @Before
    public void init() {
        circulo = new Circulo(5);
        cercle = new Circulo(7);
    }

    @Test
    public void getRadioTest() {
        assertEquals(5, circulo.getRadio(), 0.0);
        assertEquals(7, cercle.getRadio(), 0.0);
    }

    public void areaTest() {
        assertEquals(78.54, circulo.area(), 0.1);
        assertEquals(153.94, cercle.area(), 0.1);
    }
}
