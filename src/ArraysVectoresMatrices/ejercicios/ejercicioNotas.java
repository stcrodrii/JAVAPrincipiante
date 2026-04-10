package  ArraysVectoresMatrices.ejercicios ;

import java.util.Scanner;

public  class ejercicioNotas {

    public static void main (String[] args){

        //hacer un progrma donde el profe carge las notas de sus alumno sy en la ultima fila este el promedio


        Scanner sc = new Scanner(System.in);
        double promedio = 0.0;
        double notaFinal = 0;


        System.out.println("ingrese la canidad de alumnos que desea cargar");
        int alumnos = sc.nextInt();
        System.out.println("ingrese la cantidad de notas de cada alumno");
        int calificaciones = sc.nextInt();
        int notas [][] = new int[alumnos][calificaciones];

        // cargar las notas
        for(int i = 0 ; i<alumnos ; i++){
                 System.out.println("ALUMNO ["+i+"] ");
            for(int j=0 ; j<calificaciones ; j++){


                System.out.println("NOTA ["+ j +"] =" );
                notas[i][j] = sc.nextInt();



            }
            System.out.println("------------------------");
        }




        // mostrar las notas

        for(int i =0 ; i<alumnos ; i++){

            System.out.println("alumno numero ["+i+"]");
            for (int j = 0 ; j<calificaciones ; j++){

                System.out.println("NOTA ["+j+"] = "+notas[i][j] );
                promedio = promedio + notas[i][j];
                notaFinal = promedio / calificaciones ;


            }

            System.out.println("PF = ["+notaFinal+"]");
            if(notaFinal >= 6){

                System.out.println("APROBADO");
            }
            else {
                System.out.println("DESAPROVADO");
            }

            System.out.println("------------------------");
            promedio = 0;
            notaFinal = 0;

        }



    }
}

