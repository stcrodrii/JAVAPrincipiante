
package ArraysVectoresMatrices ;

import java.util.Scanner;

public  class CargaRecorrido {
       static public void main (String[] args){

            Scanner sc = new Scanner(System.in);

           int numeros [];

           System.out.println("ingresa el numero del arrys");
           int tamanio = sc.nextInt();
           numeros = new int[tamanio];


           for (int i=0; i<numeros.length ; i++){
               System.out.println("ingresa el numero en la posicion ["+ i+"]" );
               numeros[i] = sc.nextInt();;
           }

           for (int i=0; i<numeros.length ; i++){
               System.out.println(numeros[i]);
           }

       }

}