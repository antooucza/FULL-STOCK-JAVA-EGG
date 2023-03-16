import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese una letra: ");
            String letra = input.next().toLowerCase(); // Convertir la letra ingresada a minúscula
            
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("La letra ingresada es una vocal.");
            } else {
                System.out.println("La letra ingresada no es una vocal.");
            }
        }
    }
}
