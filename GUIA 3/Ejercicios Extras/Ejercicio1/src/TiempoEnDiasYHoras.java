import java.util.Scanner;

public class TiempoEnDiasYHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60; // calcula el número de horas
        int dias = horas / 24; // calcula el número de días
        horas = horas % 24; // calcula el número de horas restantes

        System.out.println(minutos + " minutos equivalen a " + dias + " día(s) y " + horas + " hora(s).");
    }
}
