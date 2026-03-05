public class ex17 {
    public static void main(String[] args) {
        int numero = 1234;
        System.out.println("Original: " + numero);
        System.out.println("Invertido: " + inverter(numero));
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