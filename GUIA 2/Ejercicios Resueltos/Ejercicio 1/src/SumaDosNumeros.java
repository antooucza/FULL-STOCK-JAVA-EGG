import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma + ".");
    }
}
