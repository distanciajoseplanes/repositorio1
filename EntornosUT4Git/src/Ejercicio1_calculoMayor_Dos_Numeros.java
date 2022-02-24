
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guille
 */
public class Ejercicio1_calculoMayor_Dos_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int primerNumero;
        primerNumero=Calculo.introduceNumero(teclado,"primer");
             
        int b;
        b=Calculo.introduceNumero(teclado,"segundo");
        
        //Primera prueba con el Debugger
        //Por donde pasa, solo por un camino, por if o else
        if (primerNumero>b)
        {
            System.out.println("El mayor es "+primerNumero);
        }
        else
        {
            System.out.println("El mayor es "+b);
        }
        
        //Segunda prueba con el Debugger
        //Por donde pasa, solo por un camino, por if o else
        //Si pasa por else, entonces seguirá preguntando 
        // y se dirigirá por uno de los dos caminos if o else
        if (primerNumero>b)
        {
            System.out.println("El mayor es "+primerNumero);
        }
        else
        {
            if (primerNumero>b)
            { 
               System.out.println("El mayor es "+b);
            }
            else
            {
                System.out.println("Son iguales");
            }
        }
        

      //Utilizando el método calcularMayor de la clase Calculo
      int mayor;
          mayor=Calculo.calcularMayor(primerNumero, b);
        System.out.println("El mayor de los dos es "+mayor);    

        
     //Utilizando el método calcularMenor de la clase Calculo
     // Tiene un error
      int menor;
          menor=Calculo.calcularMenor(primerNumero, b);
        System.out.println("El menor de los dos es "+menor);    
   
        
    }


}
