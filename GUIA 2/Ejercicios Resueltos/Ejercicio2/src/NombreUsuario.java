import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("¡Hola " + nombre + "! Bienvenido.");
    }
}
