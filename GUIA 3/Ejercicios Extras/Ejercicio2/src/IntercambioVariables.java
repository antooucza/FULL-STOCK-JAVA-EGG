public class IntercambioVariables {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;

        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores iniciales:");
        System.out.println("A: " + 10);
        System.out.println("B: " + 20);
        System.out.println("C: " + 30);
        System.out.println("D: " + 40);

        System.out.println("Valores finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
