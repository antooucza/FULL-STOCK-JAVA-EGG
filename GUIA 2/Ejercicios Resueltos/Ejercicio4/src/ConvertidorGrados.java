import java.util.Scanner;

public class ConvertidorGrados {
   public static void main(String[] args) {
      double celsius, fahrenheit;
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Ingrese la temperatura en grados Celsius: ");
      celsius = scanner.nextDouble();
      
      fahrenheit = 32 + (9 * celsius / 5);
      
      System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
   }
}

