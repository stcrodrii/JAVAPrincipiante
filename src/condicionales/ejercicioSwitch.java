/*Enunciado:

Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorías:
1- repositor, 2- cajero y 3- supervisor.

Los repositores cobran $15.890 + un bono del 10%
Los cajeros cobran $25.630,89 fijos
Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.

Se necesita un programa que, dependiendo del tipo de empleado de que se trate, calcule y muestre en pantalla el correspondiente sueldo.*/
import java.util.ArrayList;
import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("ingrese una opcion");
    System.out.println("1 agregar empleado \n" +
                        "2 ver empleados \n" +
                        "3 ver sueldos");

    int opcionIngresada = sc.nextInt();

    ArrayList<String> empelados  = new ArrayList<>();

    empelados.add("rodrigo cabral");
    empelados.add("jose cabral");
    empelados.add("catalina morales");
    empelados.add("santiago aguilar");
    empelados.add("emilio azcona");



    switch (opcionIngresada){
        case 1 :
            System.out.println("ingrese el nombre y el apellido del empelado que desea agregar");
            String nombrenew = sc1.nextLine();
            int tamanioEmpleados = empelados.size();
            empelados.add(nombrenew);
            if(tamanioEmpleados < empelados.size()){
                System.out.println("se agrego corectamente el empelado");
                System.out.println("ingrese 1 para ver 2 para salir");
                int opIngresada = sc.nextInt();
                if(opIngresada ==1){
                    do {
                        for (int i = 0 ; i< empelados.size() ; i++){
                            System.out.println(empelados.get(i));
                        }
                        System.out.println("ingrese 1 para volver a ver  2 para salir");
                         opIngresada = sc.nextInt();
                    }while (opIngresada != 2);
                    System.out.println("adios");

                }


            }
            else{
                System.out.println("ocurrio un error");
            }



            break;
        case 2 :
            for(int i = 0 ; i< empelados.size() ; i++){
                System.out.println(empelados.get(i));
            }
            break;
        case 3 :
            System.out.println("ingrese q tipo de empleado es \n" +
                    "1 repocitor \n" +
                    "2 cajero \n" +
                    "3 supervisor");

            int op = sc.nextInt();
            switch (op){
                case 1 :
                    System.out.println("Los repositores cobran $15.890 + un bono del 10%");
                    break;
                case 2 :
                    System.out.println("Los cajeros cobran $25.630,89 fijos");
                    break;
                case 3 :
                    System.out.println("Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación");
                    break;
            }


    }
}
