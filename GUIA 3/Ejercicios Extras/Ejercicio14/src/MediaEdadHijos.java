import java.util.Scanner;

public class MediaEdadHijos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de familias: ");
        int cantidadFamilias = sc.nextInt();

        double mediaEdadTotal = 0.0;

        for (int i = 1; i <= cantidadFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int cantidadHijos = sc.nextInt();

            int sumaEdades = 0;
            for (int j = 1; j <= cantidadHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + ": ");
                int edad = sc.nextInt();
                sumaEdades += edad;
            }

            double mediaEdadFamilia = (double) sumaEdades / cantidadHijos;
            System.out.println("La media de edad de los hijos de la familia " + i + " es: " + mediaEdadFamilia);

            mediaEdadTotal += mediaEdadFamilia;
        }

        double mediaEdadTotalFinal = mediaEdadTotal / cantidadFamilias;
        System.out.println("La media de edad de todos los hijos es: " + mediaEdadTotalFinal);
    }
}
