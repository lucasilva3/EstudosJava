package media;

public class Main {
    public static void main(String[] args) {

        Double[] valores = { 10.5, 20.8, 15.2, 30.1, 40.9, 25.6, 18.3, 22.1, 35.7, 48.9, 11.2, 14.5, 27.8, 33.1, 42.6, 50.3, 16.9, 29.4, 38.2, 45.1 };

        double soma = 0.0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        double media = soma / valores.length;

        System.out.printf("Média: %.2f", media);

    }
}
