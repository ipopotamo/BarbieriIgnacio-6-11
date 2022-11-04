package test;

import org.junit.Test;
import main.calcu;


import static org.junit.Assert.*;

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
        double result[] = {1 , -5};
        assertArrayEquals(cals.juan(1, 4, (-5)),result,0);
    }

//sale mal

    @Test
    public void sumarTestM() {
        assertNotEquals(cals.sumar(5, 2), 5);
    }

    @Test
    public void restarTestM() {
        assertNotEquals(cals.resstar(1, 6), 0);
    }

    @Test
    public void divTestM() {
        assertNotEquals(cals.div(444, 3), 1);
    }

    @Test
    public void porTestM() {
        assertNotEquals(cals.por(1, 3), 6);
    }

    @Test
    public void cuaTestM() {
        double var  = 991;
        double var2 = 9;

        double result[] = {var , var2};
        assertArrayEquals(cals.juan(1, 4, (-5)),result,0));

    }


}
