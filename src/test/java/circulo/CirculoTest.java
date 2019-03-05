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
}
