import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;

        while (true) {
            System.out.print("Ingrese un número entero (para salir ingrese un múltiplo de 5): ");
            num = scanner.nextInt();

            if (num % 5 == 0) {
                break;
            }

            if (num < 0) {
                continue;
            }

            count++;
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Cantidad de números leídos: " + count);
        System.out.println("Cantidad de números pares: " + countEven);
        System.out.println("Cantidad de números impares: " + countOdd);
    }
}
