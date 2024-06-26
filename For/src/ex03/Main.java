package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int x = 0;
        int y = 4;

        while (x < 3) {
            x = x + 1;
            y = y + 2;
            System.out.println("\n"+ x+ " - "+ y);
        }

    }
}
