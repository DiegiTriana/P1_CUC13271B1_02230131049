//Cálculo de Factorial: Escriba un programa en Java que calcule el factorial de un número entero `n` ingresado por el usuario e imprima 
//el proceso de calculo. El programa debe utilizar un bucle para realizar el cálculo. 
//Asegúrese de que el programa maneje correctamente los casos de borde, como el factorial de 0.

import java.util.Scanner;

public class Punto1P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Porfavor introduzca un numero entero");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Error introduzca un numero entero");
        }

        for (int i = 1; i <= numero; i++) {

            System.out
                    .println("Factorial " + i + " se obtiene de " + factorial + "*" + i + " y da: " + (factorial *= i));
        }

        System.out.println("El resultado del factorial es: " + factorial);

    }

}
