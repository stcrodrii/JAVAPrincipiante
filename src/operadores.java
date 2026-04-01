/*int a = 10;
int b = 5;
ARITMETIVOS
System.out.println(a + b); // suma → 15
System.out.println(a - b); // resta → 5
System.out.println(a * b); // multiplicación → 50
System.out.println(a / b); // división → 2
System.out.println(a % b); // resto → 0

DE INCREMENTO

a++; // incrementa en 1 → 11
a--; // decrementa en 1 → 10

int a = 10;
int b = 5;
LOGICOS
System.out.println(a == b); // igual → false
System.out.println(a != b); // distinto → true
System.out.println(a > b);  // mayor → true
System.out.println(a < b);  // menor → false
System.out.println(a >= b); // mayor o igual → true
System.out.println(a <= b); // menor o igual → false/*

 🧪 Ejercicio

Creá un programa que haga lo siguiente:

Declare:
Un número entero cantidad
Un precio precio
Usá un operador aritmético para calcular el total:
👉 total = cantidad * precio
Usá un incremento:
👉 aumentá la cantidad en 1 (como si el cliente agregara otro producto)
Usá un operador lógico + relacional:
👉 Si el total es mayor a 1000 Y la cantidad es mayor a 3
→ mostrar: "Compra con descuento"
👉 Si no → "Compra normal"
*/
void main(){

    int num1 = 1000 ;
    int cantidad = 1 ;
    double total  = cantidad * num1 ;
    int incrementar = cantidad++ ;

    if (total >= 1000 && cantidad > 3) {
        System.out.println("Compra con descuento");
    }
    else{
        System.out.println("Compra normal");
    }
    System.out.println(cantidad);

}



