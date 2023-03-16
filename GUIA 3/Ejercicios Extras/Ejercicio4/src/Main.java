import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese un número entre 1 y 10: ");
            int numero = input.nextInt();
            
            if (numero >= 1 && numero <= 10) {
                String equivalenteRomano = obtenerEquivalenteRomano(numero);
                System.out.println("El equivalente en romano de " + numero + " es " + equivalenteRomano + ".");
            } else {
                System.out.println("El número ingresado es inválido.");
            }
        }
    }

    public static String obtenerEquivalenteRomano(int numero) {
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = numero / 100;

        String equivalenteRomano = centenas[centena] + decenas[decena] + unidades[unidad];
        return equivalenteRomano;
    }
}

