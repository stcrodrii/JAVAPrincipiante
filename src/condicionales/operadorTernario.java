
/*Operador Ternario
El operador ternario, es un operador en programación que permite tomar decisiones basadas en una condición y asignar un
 valor a una variable o expresión en función de si la condición es verdadera o falsa.

Este operador se caracteriza por su sintaxis compacta y su capacidad para simplificar la escritura de condicionales
simples en una sola línea de código.

Posee tres principales partes en  su estructura:

Condición: Una expresión que se evalúa como verdadera o falsa.
Valor_si_verdadero: El valor que se asignará a la variable si la condición es verdadera.
Valor_si_falso: El valor que se asignará a la variable si la condición es falsa.*/

package condicionales;

import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {

        // ingresar la nota del alumno y diga si aprovo o no
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el promedio");
        double promedio = sc.nextDouble();

        String condicion = promedio >= 6 ? "Feliz aprobo" : "lo siento no aprobaste" ;
        System.out.println(condicion);

    }
}
