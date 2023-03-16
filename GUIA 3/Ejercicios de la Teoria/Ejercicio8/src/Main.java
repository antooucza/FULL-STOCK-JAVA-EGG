import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double nota = -1; // Inicializamos la nota con un valor que no está entre 0 y 10
            
            while (nota < 0 || nota > 10) {
                System.out.print("Ingrese una nota entre 0 y 10: ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("La nota ingresada no es válida, por favor intente de nuevo.");
                }
            }
            
            System.out.println("La nota ingresada es " + nota);
        } // Inicializamos la nota con un valor que no está entre 0 y 10
    }
}

