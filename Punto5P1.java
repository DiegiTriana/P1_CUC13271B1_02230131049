
//Patrones de Asteriscos: Cree un programa que imprima en consola un patrón de pirámide de asteriscos. 
//El usuario debe ingresar la altura de la pirámide, y el programa debe utilizar bucles anidados para imprimir el patrón correcto. 
import java.util.Scanner;

public class Punto5P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print("*");
            }

        }

        for (int i = 2; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

        }

    }
}
