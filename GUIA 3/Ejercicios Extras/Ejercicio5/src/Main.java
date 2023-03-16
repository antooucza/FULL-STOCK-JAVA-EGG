import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese la clase del socio (A, B o C): ");
            String claseSocio = input.next();
            
            if (claseSocio.equals("A") || claseSocio.equals("B") || claseSocio.equals("C")) {
                System.out.print("Ingrese el costo del tratamiento: ");
                double costoTratamiento = input.nextDouble();
                
                double importeEfectivo = calcularImporteEfectivo(claseSocio, costoTratamiento);
                
                System.out.println("El importe en efectivo a pagar por el socio de clase " + claseSocio + " es $" + importeEfectivo + ".");
            } else {
                System.out.println("La clase ingresada es inválida.");
            }
        }
    }

    public static double calcularImporteEfectivo(String claseSocio, double costoTratamiento) {
        double importeEfectivo = 0;

        if (claseSocio.equals("A")) {
            importeEfectivo = costoTratamiento * 0.5;
        } else if (claseSocio.equals("B")) {
            importeEfectivo = costoTratamiento * 0.65;
        } else if (claseSocio.equals("C")) {
            importeEfectivo = costoTratamiento;
        }

        return importeEfectivo;
    }
}

