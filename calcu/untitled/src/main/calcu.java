package main;

public class calcu {


    public double[] juan(double a, double b, double c) {
        if (a != 0) {
            double bb = b * b;
            double raiz = (double) Math.sqrt((bb) - (4 * a * (c)));
            double cuaR = ((-b) - (raiz)) / (2 * a);
            double cuaS = ((-b) + (raiz)) / (2 * a);

            return new double[]{  cuaS,cuaR};
        }
        return new double[]{0};
    }



    public static int sumar(int num, int num1){
        return num + num1;
    }
    public static int resstar(int num, int num2){
        return num - num2;
    }
    public static int div(int num, int num2){
        if(num2 != 0){
            return num/num2;
        }
        return num2;
    }
    public static int por(int num, int num2){
        return  num * num2;
    }


}
