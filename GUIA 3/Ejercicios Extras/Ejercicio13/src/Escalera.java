import java.util.Scanner;

public class Escalera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            int contador = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(contador);
                contador++;
            }
            System.out.println();
        }
    }
}
