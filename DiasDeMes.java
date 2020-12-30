
package Tarea_4;




/**
 * Este programa lea un mes en formato numérico y un año e indique el número de
 * días de ese mes.
 * Tenemos que averiguar que el formato de los numeros introducidos por teclado es correcto(numero entero).
 * Tambien tenemos que comprobar si el ano es bisiestro.
 *
 * @author Antonina Hales
 * @version 1
 * 
 */
import java.util.*;
public class DiasDeMes {
    //declaramos variables que vamos a usar 
   static int mes;
   static int ano;
   static int dias;
   static boolean esBisiestro;
    
   
   /**
    * Este metodo se usa para leer el mes en formato numero introducido por
    * teclado.
    * @return int Esto devuelve el numero inroducido por teclado
    */
   public static int inputMes(){
        Scanner sc = new Scanner(System.in);
        
        // creamos while-loop, si el formato del numero es incorrecto la pregunta se repute
        while(true){
            System.out.print("Intoduce un mes en formato numerico: ");
            
           // ponems InputMismactException si el usuario no introduce el numero entero
            try{
                mes = sc.nextInt();
                return mes;
            }
            
            catch(InputMismatchException ex){
                System.out.println("Formato incorrecto!");
                sc.nextLine();
            }  
        }
   }
   
   /**
    * Este metodo se usa para leer el año en formato numero introducido por
    * teclado.
    * @return int Esto devuelve el año intoducido por teclado
    */
   public static int inputAno(){
       Scanner sc = new Scanner(System.in);
       // creamos while-loop, si el formato del numero es incorrecto la pregunta se repute
       while(true){
        System.out.print("Introduce un año en formato numerico: ");
        
             // ponems InputMismactException si el usuario no introduce el numero entero
            try{
                 ano = sc.nextInt();
                 return ano;
            }
             catch(InputMismatchException ex){
                System.out.println("Formato incorrecto!");
                sc.nextLine();
            } 
       }
   }
   
    public static void main(String[] args){
       
        // recibimos el mes
        inputMes();
       
        // recibimos el ano
        inputAno();
        
       
        /**
         * En estos if-else loops decidimos si el año es bisiestro.
         * Un ano es bisiesto si es divisible por cuatro, excepto cuando es divisible por 100, a no ser que sea divisible por 400
         */ 
          
        if(ano % 4 == 0) {
            if( ano % 100 == 0) {
                if ( ano % 400 == 0)
                    esBisiestro = true;
                else
                    esBisiestro = false;
            }
            else
                esBisiestro = true;
        }
        else {
            esBisiestro = false;
        }

        
        // mostarmos el numero de días en un mes elegido
        switch (mes){
         case 1: //enero
         case 3: // marzo
         case 5: // mayo
         case 7: //julio
         case 8: // agosto
         case 10: // octubre
         case 12: // deciembre
             dias = 31;
             System.out.println("Hay " + dias + " días en este mes.");
             break;
             
         case 2: // febrero
            // si el año es bisiestro hay 29 días en febrero. Si no es - 28 días. 
             if(esBisiestro == true){
                 dias = 29;
                 System.out.println("Hay " + dias + " días en este mes.");
             }
             else{
                 dias = 28;  
                 System.out.println("Hay " + dias + " días en este mes.");
             }
             break;
         case 4: //abril
         case 6: // junio
         case 9: //septiembre
         case 11: // noviembre
             dias = 30;
             System.out.println("Hay " + dias + " días en este mes.");
             break;
           //si el usuario introduce un mes que no existe
         default: System.out.println("El mes introducido no existe! Prueba de nuevo.");
        }
    }
}     
    

        
        
        
        
       
    

