package Test;


import org.junit.Test;
import main.calcu;
import static org.junit.Assert.assertEquals;

public class CalculadoraT {

CalculadoraT cal = new CalculadoraT();

@Test
public void sumarTest(){
    assertEquals(calcu.sumar(2,3),5);
}

    @Test
    public void restarTest(){
        assertEquals(calcu.resstar(7,3),5);
    }
    @Test
    public void divTest(){
        assertEquals(calcu.sumar(3,3),1);
    }
    @Test
    public void porTest(){
        assertEquals(calcu.sumar(2,3),6);
    }




}
