import java.util.Scanner;

public class ConversorDivisas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double euros = scanner.nextDouble();
        scanner.nextLine(); // consume la línea en blanco
        System.out.print("Introduce la moneda a la que quieres convertir (libras/dólares/yenes): ");
        String moneda = scanner.nextLine();
        convertirDivisas(euros, moneda);
    }
    
    public static void convertirDivisas(double euros, String moneda) {
        double cambio;
        cambio = 0;
        String divisa = "";
        switch (moneda.toLowerCase()) {
            case "libras":
                cambio = 0.86;
                divisa = "£";
                break;
            case "dólares":
                cambio = 1.28611;
                divisa = "$";
                break;
            case "yenes":
                cambio = 129.852;
                divisa = "¥";
                break;
            default:
                System.out.println("La moneda introducida no es válida.");
                return;
        }
        double cantidad = euros * cambio;
        System.out.println(euros + " € equivalen a " + cantidad + " " + divisa);
    }
}
