package rectanguloTest;

import rectangulo.Rectangulo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectanguloTest {
    private Rectangulo rectangulo = null;
    private Rectangulo rectangle = null;

    @Before
    public void init() {
        rectangulo = new Rectangulo(5, 6);
        rectangle = new Rectangulo(2, 4);
    }

    @Test
    public void getMenorTest() {
        assertEquals(5, rectangulo.getMenor(), 0.0);
        assertEquals(2, rectangle.getMenor(), 0.0);
    }

    @Test
    public void getMayorTest() {
        assertEquals(6, rectangulo.getMayor(),  0.0);
        assertEquals(4, rectangle.getMayor(), 0.0);
    }

    @Test
    public void getArea() {
        assertEquals(30, rectangulo.area(), 0.0);
        assertEquals(8, rectangle.area(), 0.0);
    }
}
