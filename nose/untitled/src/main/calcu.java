package main;

public class calcu {


    public static float[] juan(float a, float b, float c) {
        float b2 = b * b;
        float cuentaR = b2 - (4 * a * c);
        float raiz = (float) Math.sqrt(cuentaR);

        float vp = ((-b) + raiz) /a * 2;
        float vm = ((-b) - raiz) /a * 2;
        float[] result= {vp, vm};
        return result;

    }


    public static int sumar(int num, int num1){
        return num + num1;
    }
    public static int resstar(int num, int num2){
        return num - num2;
    }
    public static int div(int num, int num2){
        return num / num2;
    }
    public static int por(int num, int num2){
        return  num * num2;
    }


}
