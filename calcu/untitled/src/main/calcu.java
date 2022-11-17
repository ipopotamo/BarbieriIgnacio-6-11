package main;

public class calcu {


    public double[] cuadra(double a, double b, double c) {
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



    public static int sumar(int num, int num1){
        return num + num1;
    }
    public static int resstar(int num, int num2){
        return num - num2;
    }
    public static int div(int num, int num2){
        if(num2 == 0) {
            throw new ArithmeticException("no se divide por 0 mi amigo");
        }
        return num/num2;
    }
    public static int por(int num, int num2){
        return  num * num2;
    }


}
