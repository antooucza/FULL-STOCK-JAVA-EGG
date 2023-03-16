import java.util.Scanner;

public class DispositivoRS232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int correctas = 0, incorrectas = 0;
        
        do {
            System.out.print("Ingrese una cadena (&&&&& para terminar): ");
            cadena = sc.nextLine();
            
            if (cadena.equals("&&&&&")) {
                break;
            }
            
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (true);
        
        System.out.println("Resumen de lecturas:");
        System.out.println("- Lecturas correctas: " + correctas);
        System.out.println("- Lecturas incorrectas: " + incorrectas);
    }
}
