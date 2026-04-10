package ArraysVectoresMatrices.ejercicios ;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[]args){

        //cargar datos en un vector y contar cuantas veces se cargo el numero 3

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero del vector el tamanio");

        int tamanioVector = sc.nextInt();

        int numeros [] = new int[tamanioVector];
        int numerosTres = 0 ;
        System.out.println("ingrese los numeros del vector");

        for(int i = 0; i<numeros.length ; i++){
            System.out.println("P= ["+ i +"]" );
            numeros[i] = sc.nextInt();
                    if(numeros[i] == 3){
                        numerosTres++;
                    }

        }

        System.out.println("el numero 3 se repitio esta cantidad de veces = "+ numerosTres);

    }

}