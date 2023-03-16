import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tipoMotor;
            
            System.out.print("Ingrese el tipo de motor (1-4): ");
            tipoMotor = scanner.nextInt();
            
            switch (tipoMotor) {
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigón");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                default:
                    System.out.println("No existe un valor válido para tipo de bomba");
            }
        }
    }
}
