package maiorMenorArray;

public class Main {
    public static void main(String[] args) {

        Integer[] valores = {14, 73, 28, 42, 65, 51, 85, 39, 11, 67, 22, 49, 76, 31, 58, 98, 17, 69, 82, 25};

        int maior_valor = valores[0];
        for (Integer valor : valores) {
            if (maior_valor < valor) {
                maior_valor = valor;
            }
        }

        int menor_valor = valores[0];
        for (Integer valor : valores) {
            if (menor_valor > valor) {
                menor_valor = valor;
            }
        }

        System.out.println("Menor valor do array: "+ menor_valor);
        System.out.println("Maior valor do array: "+ maior_valor);

    }
}
