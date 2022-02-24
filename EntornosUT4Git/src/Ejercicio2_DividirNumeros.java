/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guille
 */
public class Ejercicio2_DividirNumeros {
    public static final double num01 = 3;
    public static final double num02 = 3;
    public static final double num03 = 5;
    public static final double num04 = 2;
    public static final double num05 = 7;
    public static final double num06 = 9;
    public static final double num07 = 4;
    public static final double num08 = 1;
    public static final double num09 = 4;
    public static final double num10 = 6;
    public static final double num11 = 3;
    public static final double num12 = 9;
    public static final double num13 = 11;
    public static final double num14 = 3;
    public static final double num15 = 9;
    public static final double num16 = 4;
    public static final double num17 = 7;
    public static final double num18 = 1;
    public static final double num19 = 0;
    public static final double num20 = 2;
    public static final double num21 = 5;
    public static final double num22 = 0;
    public static final double num23 = 16;
    public static final double num24 = 2;
    public static double resultado = 0;
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       multiplicar(num01, num02);
       multiplicar(num03, num04);
       multiplicar(num05, num06); 
       multiplicar(num07, num08);
       multiplicar(num09, num10);
       multiplicar(num11, num12);
       multiplicar(num13, num14);
       multiplicar(num15, num16);
       multiplicar(num17, num18);
       multiplicar(num19, num20);
       multiplicar(num21, num22);
       multiplicar(num23, num24);
    }
    
    public static void multiplicar(double numero1, double numero2){
        resultado = numero1 / numero2;
        System.out.println("El resultado de Dividir "+numero1+ " / "+numero2+" es "+resultado);
    }
}
