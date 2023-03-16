import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        // Leer los 4 números
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            numeros[i] = scanner.nextInt();

            // Verificar que el número esté en el rango permitido
            while (numeros[i] < 1 || numeros[i] > 20) {
                System.out.println("El número ingresado no está en el rango permitido (1 a 20).");
                System.out.print("Ingrese otro número: ");
                numeros[i] = scanner.nextInt();
            }
        }

        // Imprimir los asteriscos
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
