package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = reader.nextInt();

        while (numero != 0) {
            System.out.print("Número: ");
            numero = reader.nextInt();
        }

        reader.close();

    }
}