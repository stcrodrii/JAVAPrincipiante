
package ArraysVectoresMatrices.Matriz.ejercicios ;

import java.util.Scanner;

public class TemperaturaCiudades {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        // declaracion de los 3 arreglos

        //cuidad
        String Ciudades [] = new String[3];

        //temperaturas
        int TemperaturaMin [] = new int[3];
        int TemperaturaMax [] = new int[3];


        //carga de los datos
        for (int i = 0 ; i<3 ; i++) {

            System.out.println("ingresa la cuidad");
            Ciudades[i] = sc.nextLine();

            System.out.println("ingresa la minima");
            TemperaturaMin[i]= sc.nextInt();

            System.out.println("ingresa la maxima");
            TemperaturaMax[i]= sc.nextInt();

            sc.nextLine();
        }


            // metodo obtener el minimo

        int Pmin = 0 ;
        int minimo = TemperaturaMin[0];
        for (int i = 0 ; i<TemperaturaMin.length ; i++){
            if(TemperaturaMin[i] < minimo ) {
                minimo = TemperaturaMin[i];

                Pmin= i ;

            }
        }

        int Pmax = 0;
        int maximo =  TemperaturaMax[0];
        for (int i = 0 ; i<TemperaturaMax.length ; i++){
            if( TemperaturaMax[i] > maximo) {
                maximo = TemperaturaMax[i];
                Pmax = i ;
            }
        }


        for (int i = 0 ; i<3 ; i++) {
            System.out.println(Ciudades[i] + " --->  minima ["+TemperaturaMin[i]+"]  maxima ["+TemperaturaMax[i]+"]");
        }

        System.out.println("-------------------------------------------");

        System.out.println("la minima fue de " + minimo +" y fue en la ciudad "+ Ciudades[Pmin]);
        System.out.println("la maxima fue de " + maximo +" y fue en la ciudad "+ Ciudades[Pmax]);



        }
    }

