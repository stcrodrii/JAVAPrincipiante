/* jeugo de adivinar numero y que al final te diga cuantos numeros usasate y cuales fueron pares */
package estructurasRepetitivas ;

import java.util.ArrayList;
import java.util.Scanner;

public  class whileContador {
    public  static  void main (String[] args){
        Scanner sc = new Scanner(System.in);


        int contador = 0;

        int numeroSuerte = 43;
        int numeroUsuario = 0 ;
        ArrayList <Integer> numeros = new ArrayList<>();

        while (numeroSuerte != numeroUsuario){
            System.out.println("ingrese numeros hasta adivinar el numero ");
            numeroUsuario = sc.nextInt();
            if(numeroUsuario == numeroSuerte){
                System.out.println("GENIAL ganaste el numero era"+numeroSuerte);
                break;
            }
            else {
                System.out.println("lo siento el numero esta mal siga intentando");

                if(numeroUsuario % 2 == 0) {

                    numeros.add(numeroUsuario);

                }

            }
            contador++ ;
        }

        System.out.println("los numero ingresados en total fueron " + (contador ) + "y los pares fueron ["+numeros.size() + "]");

        for(int i =0 ; i<numeros.size() ; i++){

            System.out.println(" los numero pares son [" + numeros.get(i) + "]" );
        }



    }

}