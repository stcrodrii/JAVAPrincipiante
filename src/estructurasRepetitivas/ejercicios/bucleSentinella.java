package  estructurasRepetitivas.ejercicios ;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public  class bucleSentinella {
    public  static  void main(String[]args){

         Scanner sc = new Scanner(System.in);
        String palabra  ;
        ArrayList<String> palabras = new ArrayList<>();

        do {
            System.out.println("ingresa palabras hasta que quieras salir y escribi salir o SALIR");
            palabra = sc.nextLine();

            if(palabra.equals("salir") || palabra.equals("SALIR")){

             break ;
            }
            palabras.add(palabra);


        }
        while (!palabra.equals( "SALIR") && !palabra.equals("salir"));

        for(int i =0 ; i< palabras.size() ; i++){
            System.out.println(palabras.get(i));
        }










    }

}