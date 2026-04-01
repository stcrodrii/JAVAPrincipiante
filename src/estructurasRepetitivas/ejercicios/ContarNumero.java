package estructurasRepetitivas.ejercicios ;

import java.util.Scanner;

public  class ContarNumero {


void main (){



        //hacer un progrograma que cuente desde un numero ingreado(desde donde) hasta el 2do numero ingreado (hasta donde)

        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa 2 numeros para que te cuante del primero al segundo ");
        System.out.println("numero 1");
        int num1 = sc.nextInt();
        System.out.println("numero 2");
        int num2 = sc.nextInt();

        if (num2 <= num1) {
            System.out.println("el numero 2 no puede ser mas chico que el numero1 o igual ");

        }
        else {

            for(int i = num1; i<= num2 ; i++){
                System.out.println(i);
            }

        }

        sc.close();
}




}
