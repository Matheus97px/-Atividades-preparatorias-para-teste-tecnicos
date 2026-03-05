public class ex15 {
    public static void main(String[] args) {
        String texto = "banana";
        char caracter = 'a';
        int contador = 0;

        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == caracter){
                contador++;
            }
        }
        System.out.println("O texto " + texto + ", possui " + contador + " " + caracter);
    }
        }
