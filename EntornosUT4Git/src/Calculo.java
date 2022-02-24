import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guille
 */
public class Calculo {
 
    
 public static int calcularMayor(int x, int y)
 {
   int my;
   if(x>y)
   {    
       my=x;
   }
   else
   {
       my=y;
   }
   return my;
 }   
 
 //Tiene un error
 public static int calcularMenor(int x, int y)
 {
   int mn;
   if(x>y)
   {    
       mn=y;
   }
   else
   {
       mn=x;
   }
   return mn;
 }   
 
 
  //calcula el factorial del entero positivo n
  // devuelve un long
  
  public static long calcularFactorial(int n)
  {
      long fact=1;
      for(int i=1;i<=n;i++)
      {
          fact+=i;
      }
      return fact;
  }
  
  public static int sumarDivisores(int n)
  {
      int suma=0;
      for(int cont=1;(cont<=n/2);cont++)
      {
        if (n%cont==0){  
              suma+=cont;
        }
      }
      suma+=n;
      
      return suma;
  }

    public static int introduceNumero(Scanner teclado, String cadena) throws NumberFormatException {
        String cad;
        int a;
        System.out.println("Dime el " + cadena + " n\u00famero ");
        cad = teclado.nextLine();
        a = Integer.parseInt(cad);
        return a;
    }
    
    public void mensaje(){
       System.out.println("Añadiendo para GitHub");
    }
    
}
