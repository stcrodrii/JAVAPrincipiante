package ArraysVectoresMatrices.Matriz;

import java.util.Scanner;

public  class matrices {

    public  static  void main (String[]args){

        Scanner sc = new Scanner(System.in);
        int numeros [][]=new int[3][3];


        for(int i =0; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.println("ingresa los valores para la matriz ");
                System.out.println("posicion ["+i+"] posicion ["+j+"]" );
                numeros[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){

                System.out.println(" los valores INGRESADOS para la matriz son");
                System.out.println( "posicion ["+i+"]  posicion ["+j+"] ="+numeros[i][j] );


            }
        }

    }
}

/*
 creado por ollama

package ArraysVectoresMatrices;

import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        System.out.println("Ingrese los valores para la matriz:"); // Mensaje de entrada

        for (int i = 0; i < 3; i++) { // Iteración sobre filas
            for (int j = 0; j < 3; j++) {
                numeros[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nLos valores ingresados para la matriz son:"); // Mensaje de salida

        for (int i = 0; i < 3; i++) { // Iteración sobre filas
            for (int j = 0; j < 3; j++) {
                System.out.print("Posición [" + i + "] posicion [" + j + "] = " + numeros[i][j] + "\t"); // Formato de impresión con separadores y espaciado
            }
            System.out.println(); // Salto de línea para cada fila
        }

        sc.close();
    }
}


 */