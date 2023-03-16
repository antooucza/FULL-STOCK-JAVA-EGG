import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int cantidadDigitos = 0;
        while (numero != 0) {
            numero /= 10; // Se divide el número entre 10 para "eliminar" el último dígito
            cantidadDigitos++; // Se cuenta el número de dígitos
        }

        System.out.println("El número de dígitos es: " + cantidadDigitos);
    }
}

