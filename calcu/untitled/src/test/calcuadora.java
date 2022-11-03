package test;

import org.junit.Test;
import main.calcu;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class calcuadora {

    calcu cals = new calcu();

//sale bien
    @Test
    public void sumarTest() {
        assertNotEquals(cals.sumar(5, 3), 5);
    }

    @Test
    public void restarTest() {
        assertEquals(cals.resstar(1, 1), 0);
    }

    @Test
    public void divTest() {
        assertEquals(cals.div(3, 3), 1);
    }

    @Test
    public void porTest() {
        assertEquals(cals.por(2, 3), 6);
    }

    @Test
    public void cuaTest() {
        assertEquals(String.valueOf(new float[][]{cals.juan(1, 2, 1)}), 1, 1);
    }

//sale mal

    @Test
    public void sumarTestM() {
        assertNotEquals(cals.sumar(5, 2), 5);
    }

    @Test
    public void restarTestM() {
        assertEquals(cals.resstar(1, 6), 0);
    }

    @Test
    public void divTestM() {
        assertEquals(cals.div(444, 3), 1);
    }

    @Test
    public void porTestM() {
        assertEquals(cals.por(1, 3), 6);
    }

    @Test
    public void cuaTestM() {
        assertEquals(String.valueOf(new float[][]{cals.juan(1, 2, 1)}), 55, 4);

    }
}
