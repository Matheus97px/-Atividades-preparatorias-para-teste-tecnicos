
public class ex13 {

    public static void main(String[] args) {
        int[] testes = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int n : testes) {
            System.out.println("O número " + n + " é primo? " + isPrimo(n));
        }

        // int numeroEscolhido = 7;
        // System.out.println("O número " + numeroEscolhido + " é primo? " + isPrimo(numeroEscolhido));
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
