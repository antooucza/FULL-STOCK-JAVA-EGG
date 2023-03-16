import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese un número: ");
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }
            if (num > 0) {
                sum += num;
            }
        }

        System.out.println("La suma de los números positivos es: " + sum);
    }
}
