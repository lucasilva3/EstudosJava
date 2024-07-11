package MediaNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Double[] notas = new Double[3];

        System.out.println("[Insira as notas para calcular a média]");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("\tNota "+ (i+1)+ ": ");
            notas[i] = reader.nextDouble();
        }

        double media = calcularMedia(notas);
        System.out.println("\n[Resultado]");
        System.out.printf("\tMédia: %.2f", media);

        reader.close();

    }

    public static double calcularMedia(Double[] _notas) {
        double soma = 0.0;
        for (int i = 0; i < _notas.length; i++) {
            soma += _notas[i];
        }
        return soma / _notas.length;
    }
}
