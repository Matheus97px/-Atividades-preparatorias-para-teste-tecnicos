public class ex4 {
    public static void main(String[] args) {
        int numero = 12321;
        palindromo(numero);
    }


    public static void palindromo(int n) {
        int invertido = inverter(n);

        if (invertido == n) {
            System.out.println("O número " + n + " é palíndromo: " + invertido + " === " + n);
        } else {
            System.out.println("O número " + n + " não é palíndromo: " + invertido + " !== " + n);
        }
    }

    public static int inverter(int n) {
        int invertido = 0;
        
        while (n > 0) {
            int ultimoDigito = n % 10;      
            invertido = (invertido * 10) + ultimoDigito;
            n = n / 10;                     
        }
        
        return invertido;
    }
}