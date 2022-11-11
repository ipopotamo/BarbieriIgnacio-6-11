package com.calculadora.calcu;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ruta {

    @GetMapping("/suma/{num1}/{num2}")
    int suma(@PathVariable int num1,@PathVariable int num2){

        return num1 +num2;

    }
    @GetMapping("/resta/{num1}/{num2}")
    int resta(@PathVariable int num1,@PathVariable int num2){

        return num1  - num2;

    }
    @GetMapping("/multiplication/{num1}/{num2}")
    int multi(@PathVariable int num1,@PathVariable int num2){

        return num1 * num2;

    }
    @GetMapping("/divicion/{num1}/{num2}")
    float div(@PathVariable int num1,@PathVariable int num2){

        if(num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    @GetMapping("/cuadara/{a}/{b}/{c}")
    double[] cuadra(@PathVariable int a,@PathVariable int b,@PathVariable int c){

            double bb = b * b;
            double raiz = (double) Math.sqrt((bb) - (4 * a * (c)));
            double cuaR = ((-b) - (raiz)) / (2 * a);
            double cuaS = ((-b) + (raiz)) / (2 * a);

            return new double[]{cuaS,cuaR};


    }



}
