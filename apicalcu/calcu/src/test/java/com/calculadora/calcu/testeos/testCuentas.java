package com.calculadora.calcu.testeos;

import com.calculadora.calcu.Cuentas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCuentas {

    private Cuentas cuentas;

    @BeforeEach
    public void a(){
        cuentas = new Cuentas();
    }

    @Test
    public void suma(){
        Assertions.assertEquals(cuentas.suma(4,1),5);
        Assertions.assertEquals(cuentas.suma(100,21),121);
        Assertions.assertNotEquals(cuentas.suma(4,8),5);
    }
    @Test
    public void resta(){
        Assertions.assertEquals(cuentas.resta(4,4),0);
        Assertions.assertEquals(cuentas.resta(10,5),5);
        Assertions.assertEquals(cuentas.resta(1,2),-1);
        Assertions.assertNotEquals(cuentas.resta(22,20),1);
    }

    @Test
    public void multi(){
        Assertions.assertEquals(cuentas.multi(4,1),4);
        Assertions.assertEquals(cuentas.multi(-10,2),-20);
        Assertions.assertNotEquals(cuentas.multi(4,8),5);
    }
    @Test
    public void div(){
        Assertions.assertEquals(cuentas.div(4,1),4);
        Assertions.assertEquals(cuentas.div(-10,2),-5);
        Assertions.assertNotEquals(cuentas.div(4,8),5);
        Assertions.assertThrows(ArithmeticException.class,() -> {cuentas.div(2,0);});
    }

    @Test
    public void cuadratic(){
        double result[] = {1 , -5};

        Assertions.assertArrayEquals(cuentas.cuadra(1,4,(-5)),result,0);
        Assertions.assertArrayEquals(cuentas.cuadra(1,7,(-5)),result,99);
        Assertions.assertThrows(ArithmeticException.class,() -> {cuentas.cuadra(0,3,4);});
        Assertions.assertThrows(ArithmeticException.class,() -> {cuentas.cuadra(2,1,3);});


    }







}
