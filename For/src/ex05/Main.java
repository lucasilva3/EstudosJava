package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Repetir: ");
        int repetir = reader.nextInt();

        System.out.println();
        int soma = 0;
        for (int i=0; i < repetir; i++) {
            System.out.print("Número: ");
            int numero = reader.nextInt();
            soma += numero;
        }

        System.out.println("\nSoma: "+ soma);

        reader.close();

    }
}
