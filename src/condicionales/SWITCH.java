
/*CONDICIONAL SWITCH
La estructura “Switch” permite múltiples caminos a partir de la evaluación de una sola
expresión/condición. La construcción de esta estructura se ejecuta mediante la evaluación d
e la condición y un conjunto de casos llamados cases.

Cada case es una posible respuesta a la evaluación de esa condición, si el valor que se busca
coincide con algún case, se ejecuta el mismo hasta la sentencia break o hasta el final del Switch (dependiendo del caso).

Pero basta de tanta teoría y… ¡Vayamos al grano! A continuación te dejamos un video donde te comentamos de qué
manera se utiliza y cómo implementar el SWITCH en Java. ¡Vamos!

Recordá que podés replicar en tu IDE todos los ejemplos prácticos dados en cada clase, con la finalidad de i
ncorporar los conceptos que se vayan dando.*/
void main(){
    int num1 , num2 , num3 , num4 ;
    int eleccion = 4 ;
    num1 = 4;
    num2 = 4 ;
    System.out.println("ingrese el numero de la operacioj que desea realizar ");
    System.out.println("1-> Elegiste sumar\"\n" +
                        "2-> \"Elegiste restar\"\n" +
                        "3 -> \"Elegiste multiplicar\"\n" +
                        "4 -> \"Elegiste dividir\"");

    System.out.println("-----------------------------------------------------------------");

    switch (eleccion){
        case 1 :
            System.out.println("la suma es = "+ (num1+num2));
            break;
        case 2 :
            System.out.println("la resta es = " + (num1-num2));
            break;
        case 3 :
            System.out.println("la multi es ="+ (num1*num2));
            break;
        case 4 :
            if(num1 < num2){
                System.out.println("el dicisor es mas chico el dividendo no se puede realizar la operacion");
            }

            else{
            System.out.println("la division es = " + (num1 / num2));
             }
            break;
        default:
            System.out.println("OCURRIO UN ERROR");
    }
}