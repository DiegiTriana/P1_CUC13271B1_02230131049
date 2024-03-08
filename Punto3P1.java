
//Suma de Series: Implemente un programa que calcule la suma de la serie `1 + 1/2 + 1/3 + ... + 1/n`, 
//donde `n` es un número entero proporcionado por el usuario e imprima el proceso de calculo.
import java.util.Scanner;

public class Punto3P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0;
        double conteo = 0.0;
        System.out.println("Porfavor introduzca un numero entero");
        int n = teclado.nextInt();

        if (n < 0) {
            System.out.println("Error introduzca un numero entero");
        }

        for (int i = 1; i <= n; i++) {
            conteo = 1.0 / i;
            suma += 1.0 / i;
            System.out
                    .println("La serie " + i + " se obtiene de " + "1/" + i + " y da: " + conteo);
        }

        System.out.println("El resultado de la suma de las series es: " + suma);

    }
}
