import java.util.Scanner;

public class MayusculasMinusculas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese una frase: ");
        String frase = input.nextLine();
        
        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        
        System.out.println("Frase en mayúsculas: " + mayusculas);
        System.out.println("Frase en minúsculas: " + minusculas);
    }
}

