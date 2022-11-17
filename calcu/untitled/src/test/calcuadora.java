package test;

import org.junit.Test;
import main.calcu;


import static org.junit.Assert.*;

public class calcuadora {

    calcu cals = new calcu();

//sale bien
    @Test
    public void sumaB() {
        assertNotEquals(cals.sumar(5, 3), 5);
    }

    @Test
    public void restaB() {
        assertEquals(cals.resstar(1, 1), 0);
    }

    @Test
    public void divB() {
        assertEquals(cals.div(3, 3), 1);
    }

    @Test
    public void multiB() {
        assertEquals(cals.por(2, 3), 6);
    }

    @Test
    public void cuadraticB() {
        double result[] = {1 , -5};
        assertArrayEquals(cals.cuadra(1, 4, (-5)),result,0);
    }

    @Test
    public void cuadraticRN() {
        double result[] = {1 , -5};
        assertThrows(ArithmeticException.class,() -> {cals.cuadra(2,1,3);});
    }

    @Test
    public void cuadraticA0() {
        double result[] = {1 , -5};
        assertThrows(ArithmeticException.class,() -> {cals.cuadra(0,3,4);});
    }


    @Test
    public void div0() {
        assertThrows(ArithmeticException.class, () -> {
            cals.div(2, 0);
        });

    }

//sale mal

    @Test
    public void sumarM() {
        assertNotEquals(cals.sumar(5, 2), 5);
    }

    @Test
    public void restaM() {
        assertNotEquals(cals.resstar(1, 6), 0);
    }

    @Test
    public void divM() {
        assertNotEquals(cals.div(444, 3), 1);
    }

    @Test
    public void multiM() {
        assertNotEquals(cals.por(1, 3), 6);
    }

    @Test
    public void cuadraticM() {
        double var  = 991;
        double var2 = 9;

        double result[] = {var , var2};

        assertArrayEquals(cals.cuadra(1, 4, (-5)),result,990);

    }

}
