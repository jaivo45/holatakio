
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author lab4_pc12
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              int operando1, operando2, opera;
              int selec=0;
              Scanner cc = new Scanner (System.in);
              System.out.println("Selecciona la opreracion que desea realizar:");
              System.out.println("<<<<1 Suma>>>> ,<<<<2 Resta>>>>,<<<<3 Multiplicacion>>>>,<<<4 Divicion>>>>");
              opera = cc.nextInt();


              System.out.print("Igresa el Primer valor:");
              operando1 = cc.nextInt();
              System.out.print("Igresa el Segundo valor:");
              operando2 = cc.nextInt();
     
      switch(opera)
      {
          case 1:
             if (opera==1)//Si la variable opera es == 1 realiza lo siguiente, si no reliza el caso 2
             {
                   Operaciones op = new Operaciones();
                   System.out.println("Resultado:" + op.sumaNumeros(operando1,operando2));
             }
             
           case 2:
             if (opera==2)
             {
                   Operaciones res = new Operaciones();
                   System.out.println("Resultado:" + res.restaNumeros(operando1,operando2));
             } 
             
           case 3:
             if (opera==3)
             {
                  Operaciones mult = new Operaciones();
                  System.out.println("Resultado:" + mult.multiplicaNumeros(operando1,operando2));//Llma la clase Operaciones 
             }
             
           case 4:
             if (opera==4)
             {
                 try {//Hace una Exception cundo el codigo no puede resolver el problema
                      Operaciones div = new Operaciones();
                      System.out.println("Resultado:" + div.divideNumeros(operando1,operando2));
                     } catch(ArithmeticException in){
                       System.err.print("El caracter ingresado es incorrecto!!");//Muestra este dialogo si existe un problema
                     }
             }
              
               
      }
  }
      
}
