import java.util.Scanner;

/**---Comentario de Documentacion---
 * @Programa: "Ejercicio 1 - Operadores"
 * @author: Ribas Carlos
 * @version: 1.0.0
 * @see:
 */

/* ---Comentario de bloque---
 * Ejercicio 1
 * Hacer un programa que calcule e imprima la suma de tres calificaciones
 * usando la clase Scanner para la entrada de datos.
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean band;
        do {
            int suma = 0;
            band = false;
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese 3 numeros enteros: ");
                System.out.print(i + ". ");
                int num = teclado.nextInt();
                suma = suma + num;
            }
            System.out.println("La suma es: " + suma);
            System.out.println("Desea continuar (true/false)");
            band = teclado.nextBoolean();
        } while (band == true);
    }
}