import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = (int) (Math.random() * 11); // Genera un número aleatorio entre 0 y 10
        int num2 = (int) (Math.random() * 11);

        System.out.println("Adivina el resultado de la multiplicación entre " + num1 + " y " + num2);

        int respuesta;
        do {
            System.out.print("Ingrese su respuesta: ");
            respuesta = scanner.nextInt();

            if (respuesta == num1 * num2) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Respuesta incorrecta, intenta de nuevo.");
            }
        } while (respuesta != num1 * num2);
    }
}
