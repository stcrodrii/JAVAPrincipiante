package ArraysVectoresMatrices.ejercicios ;


import java.util.Scanner;

public  class ejercicio3Nombres {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos nombres queres agregar");
        int nombresTamanio = sc.nextInt();
        sc.nextLine(); // limpiar el scanner
        String nombres [] = new String[nombresTamanio] ;

        System.out.println("agreagar los nombres ");
        //cargar el vector
        for(int i = 0 ; i<nombres.length ; i++){
            nombres[i] = sc.nextLine();

        }
        // mostrar
        for(int i =0 ; i<nombres.length ; i++){
            System.out.println("nombre = " +nombres[i]);
        }

    }
}