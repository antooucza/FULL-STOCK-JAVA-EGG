import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = input.nextInt();

        int doble = num * 2;
        int triple = num * 3;
        double raizCuadrada = Math.sqrt(num);

        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es: " + triple);
        System.out.println("La raíz cuadrada de " + num + " es: " + raizCuadrada);
    }
}

