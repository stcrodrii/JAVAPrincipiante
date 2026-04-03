
package estructurasRepetitivas.ejercicios;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public  class CarreraInmigrante {

  public   static void main (String[] args){

            int edad , dni ;
            String nombreCompleto ;

      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> participantes = new ArrayList<>();
      System.out.println("hola por favor ingresa");
      System.out.println("ingresa la edad , dni y nombre completo y te decimos que categoria sos ");

      do {
          System.out.println("edad");
          edad = sc.nextInt();
          System.out.println("dni");
          dni = sc.nextInt();
          sc.nextLine();
          System.out.println("nombreCompleto");
          nombreCompleto = sc.nextLine();

          if(edad < 6){
              System.out.println("usted no puede participar");
          }
          if(edad >= 6 && edad <= 10){
              System.out.println("CATEGORIA : menores A");
          }
          if(edad >= 11 && edad <= 17){
              System.out.println("CATEGORIA : menores B");
            }
          if (edad >= 18 && edad <= 30) {
              System.out.println("CATEGORIA : juveniles");
          }
          if(edad >= 31 && edad <= 50){
              System.out.println("CATEGORIA : adultos");
          }
          if(edad>50){
              System.out.println("CATEGORIA : mayores");
          }

          participantes.add(dni);

      }while (dni != 0 && !nombreCompleto.equals("fin"));


        for (int i = 0 ; i< participantes.size() ; i++){
            System.out.println(participantes.get(i));
        }


      System.out.println("TERMINAMOS EL EJERCICIOS");

    }
}