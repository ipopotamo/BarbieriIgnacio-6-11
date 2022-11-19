package com.calculadora.calcu.testeos;

import com.calculadora.calcu.Cuentas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class testCuentas {

    private Cuentas cuentas;

    @BeforeEach
    public void a(){
        cuentas = new Cuentas();
    }


//SUMA


    @Test
    public void sumaB(){
        assertEquals(cuentas.suma(2,2),4);

    }

    @Test
    public void sumaN(){
        assertEquals(cuentas.suma((-4),(2)),(-2));
    }

    @Test
    public void sumaM()
    {
        assertNotEquals(cuentas.suma(4,8),5);
    }


    //RESTA

    @Test
    public void restaB(){

        assertEquals(cuentas.resta(10,5),5);


    }

    @Test
    public void restaBNeg(){


        assertEquals(cuentas.resta(1,2),-1);

    }


    @Test
    public void resta0(){
        assertEquals(cuentas.resta(4,4),0);
    }

    @Test
    public void restaM(){
        assertNotEquals(cuentas.resta(22,20),1);
    }

//MULTIPLICACION 

    @Test
    public void multiB(){
        assertEquals(cuentas.multi(4,1),4);
    }

    @Test
    public void multiN(){
        assertEquals(cuentas.multi(-10,2),-20);
    }

    @Test
    public void multiM(){
        assertNotEquals(cuentas.multi(4,8),5);
    }


//DIVISION

    @Test
    public void div(){
        assertEquals(cuentas.div(4,1),4);
    }
    @Test
    public void divn(){
        assertEquals(cuentas.div(-10,2),-5);
    }

    @Test
    public void divM(){
        assertNotEquals(cuentas.div(4,8),5);
    }
    @Test
    public void divCdecimal(){
        assertEquals(cuentas.div(3,4),(0.75));
    }

    @Test
    public void divE(){
        assertThrows(ArithmeticException.class,() -> {cuentas.div(2,0);});
    }


//CUADRATICA


    @Test
    public void cuadraticB(){
        double result[] = {1 , -5};
        assertArrayEquals(cuentas.cuadra(1,4,(-5)),result,0);
    }

    @Test
    public void cuadraticM(){
        double result[] = {1 , -5};
        assertArrayEquals(cuentas.cuadra(1,7,(-5)),result,99);
    }

    @Test
    public void cuadraticRN(){
        assertThrows(ArithmeticException.class,() -> {cuentas.cuadra(2,1,3);});
    }
    @Test
    public void cuadraticA0(){
        assertThrows(ArithmeticException.class,() -> {cuentas.cuadra(0,3,4);});
    }





}
