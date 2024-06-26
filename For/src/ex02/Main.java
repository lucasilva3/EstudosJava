package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = reader.nextInt();

        int soma = 0;
        while (numero != 0) {
            soma += numero;
            System.out.print("Número: ");
            numero = reader.nextInt();
        }

        System.out.println("\nSoma: "+ soma);
        reader.close();

    }
}