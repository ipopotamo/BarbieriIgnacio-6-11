package com.calculadora.calcu;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cuentas {


    @GetMapping("/suma/{num1}/{num2}")
    public int suma(@PathVariable int num1, @PathVariable int num2){
        return num1 +num2;
    }

    @GetMapping("/resta/{num1}/{num2}")
    public int resta(@PathVariable int num1,@PathVariable int num2){
        return num1  - num2;
    }

    @GetMapping("/multiplication/{num1}/{num2}")
    public int multi(@PathVariable int num1,@PathVariable int num2){
        return num1 * num2;
    }

    @GetMapping("/divicion/{num1}/{num2}")
    public float div(@PathVariable float num1,@PathVariable float num2){

        if(num2 == 0) {
            throw new ArithmeticException("no se divide por 0 mi amigo");
        }
        return num1/num2;
    }

    @GetMapping("/cuadara/{a}/{b}/{c}")
    public double[] cuadra(@PathVariable int a,@PathVariable int b,@PathVariable int c){

        if( a == 0)
        {
            throw new ArithmeticException("no puede ser un polinomio ");
        }

        double bb    = b * b;
        double Draiz = (bb) - (4 * a * (c));

        if (Draiz < 0){
            throw new ArithmeticException("no existe raiz de un numero negativo ");
        }

        double raiz = (double) Math.sqrt(Draiz);
        double cuaR = ((-b) - (raiz)) / (2 * a);
        double cuaS = ((-b) + (raiz)) / (2 * a);

        return new double[]{cuaS,cuaR};


    }




}
