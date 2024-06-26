package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = reader.nextInt();

        for (int i=0; i < numero; i++) {
            System.out.println(i);
        }

        reader.close();

    }
}
