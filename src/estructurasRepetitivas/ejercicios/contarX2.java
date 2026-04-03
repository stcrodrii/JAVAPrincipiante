package estructurasRepetitivas.ejercicios;

public class contarX2 {
        public static void main(String[] args){



            //contar desde el 200 hasta el 250 en 2

           // int num1 = 200 ;
            int num2 = 10 ;

            for(int i= 1; i<= num2; i++){
                i++ ;
                System.out.println((i));
            }

            System.out.println("-----------------------------------------------------");

            // ahora lo mismo pera usanfo while y usando contador

            int contador = 200 ;
            while (contador <= 250){
                System.out.println(contador );
                contador = contador + 2 ;
            }
        }

        // ahora lo mismo pera usanfo while


}