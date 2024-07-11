package AreaPerimetroRetangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("[Insira os dados do retângulo]");
        System.out.print("\tComprimento: ");
        double comprimento = reader.nextDouble();
        System.out.print("\tLargura....: ");
        double largura = reader.nextDouble();

        System.out.println("\n[Resultado]");
        System.out.println("\tÁrea.....: "+ calcularArea(comprimento, largura));
        System.out.println("\tPerímetro: "+ calcularPerimetro(comprimento, largura));

        reader.close();

    }

    public static double calcularArea(double _comprimento, double _largura) {
        return _comprimento * _largura;
    }

    public static double calcularPerimetro(double _comprimento, double _largura) {
        return 2 * (_comprimento + _largura);
    }
}
