import java.util.Scanner;

public class NumeroPrimo {
  
  // Función para determinar si un número es primo
  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  // Función principal que pide un número por teclado y llama a la función esPrimo
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Ingrese un número: ");
          int numero = sc.nextInt();
          if (esPrimo(numero)) {
              System.out.println(numero + " es un número primo");
          } else {
              System.out.println(numero + " no es un número primo");
          } }
  }
}

