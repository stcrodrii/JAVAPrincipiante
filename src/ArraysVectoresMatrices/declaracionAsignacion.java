package ArraysVectoresMatrices ;

import java.util.Scanner;

public class declaracionAsignacion
{
    public static  void main (String[]args){


        Scanner sc = new Scanner(System.in);
        //los arreglos solo pueden ser de un tipo de dato ej int

     // declaracion de un arreglo
        int numeros [] = new int[5];
        numeros[0] = 3 ;
        numeros[1]=5;
        numeros[2]= 34;
        numeros[3]= 34;
        numeros[4]= 34;


        System.out.println(numeros[1]);

        System.out.println("-------------------------------");




        //recorrido
        for (int i= 0; i<numeros.length ; i++){
            System.out.println(numeros[i]);
        }






    }


}