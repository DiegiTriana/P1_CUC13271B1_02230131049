
//Contador de vocales y consonantes: Cree un programa que cuente el número de vocales y consonantes en una cadena de texto proporcionada 
//por el usuario e imprima cuales tiene el texto.
import java.util.Scanner;

public class Punto2P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vocal = 0;
        int consonante = 0;
        System.out.println("Escriba un texto");
        String texto = teclado.nextLine().toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char character = texto.charAt(i);
            if (character >= 'a' && character <= 'z') {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    vocal++;
                    System.out.println("'" + character + "' es una vocal.");
                } else {
                    consonante++;
                    System.out.println("'" + character + "' es una consonante.");

                }
            } else {
                System.out.println("No digito correctamente el texto o digito numeros o signos");
            }
        }
        System.out.println("Total de vocales: " + vocal);
        System.out.println("Total de consonantes: " + consonante);

    }
}
