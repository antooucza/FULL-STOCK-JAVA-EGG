import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Ingrese la cantidad de personas: ");
            n = sc.nextInt();
            
            String[] nombres = new String[n];
            int[] edades = new int[n];
            
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el nombre de la persona " + (i+1) + ": ");
                nombres[i] = sc.next();
                System.out.print("Ingrese la edad de la persona " + (i+1) + ": ");
                edades[i] = sc.nextInt();
            }
            
            int i = 0;
            String respuesta;
            do {
                System.out.println("Nombre: " + nombres[i] + ", Edad: " + edades[i] + (edades[i] >= 18 ? " (Mayor de edad)" : " (Menor de edad)"));
                System.out.print("¿Desea mostrar la siguiente persona? (Si/No): ");
                respuesta = sc.next();
                i++;
            } while (i < n && respuesta.equalsIgnoreCase("Si"));
        }
    }
}
