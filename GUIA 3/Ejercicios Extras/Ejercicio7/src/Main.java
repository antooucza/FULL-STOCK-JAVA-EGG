//usando el bucle while

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a evaluar: ");
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        int i = 0;
        while (i < n) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();

            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;

            i++;
        }

        double avg = (double) sum / n;

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + avg);
    }
}
