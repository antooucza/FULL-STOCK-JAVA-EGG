import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor límite positivo: ");
        int limite = scanner.nextInt();

        int suma = 0;
        int contador = 1;

        while (suma <= limite) {
            System.out.print("Ingrese el número #" + contador + ": ");
            int numero = scanner.nextInt();

            suma += numero;
            contador++;
        }

        System.out.println("La suma de los números introducidos es " + suma + ", que es mayor que el límite de " + limite);
    }
}

