public class Contador {
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            int digito1 = i / 100;
            int digito2 = (i / 10) % 10;
            int digito3 = i % 10;
            String cadena1 = Integer.toString(digito1);
            String cadena2 = Integer.toString(digito2);
            String cadena3 = Integer.toString(digito3);
            if (cadena1.equals("3")) {
                cadena1 = "E";
            }
            if (cadena2.equals("3")) {
                cadena2 = "E";
            }
            if (cadena3.equals("3")) {
                cadena3 = "E";
            }
            System.out.println(cadena1 + "-" + cadena2 + "-" + cadena3);
        }
    }
}
