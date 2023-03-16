import java.util.Scanner;

public class Estaturas {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           int n;
           float altura, promedioTotal = 0, promedioMenor160 = 0;
           int contadorMenor160 = 0;
           System.out.print("Ingrese la cantidad de personas: ");
           n = sc.nextInt();
           for(int i=1; i<=n; i++) {
               System.out.print("Ingrese la altura de la persona " + i + " en metros: ");
               altura = sc.nextFloat();
               promedioTotal += altura;
               
               if(altura < 1.6) {
                   promedioMenor160 += altura;
                   contadorMenor160++;
               }
           }    if(contadorMenor160 > 0) {
               promedioMenor160 /= contadorMenor160;
               System.out.println("El promedio de estaturas menores a 1.6 mts es: " + promedioMenor160);
           } else {
               System.out.println("No hay estaturas menores a 1.6 mts.");
           }    promedioTotal /= n;
           System.out.println("El promedio de estaturas en general es: " + promedioTotal);
       }
   }
}
