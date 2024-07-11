package NumeroPrimo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("[Insira um número para verificar se é primo, positivo ou negativo]");
        System.out.print("Número: ");
        int numero = reader.nextInt();

        boolean primo = verificar(numero);
        if (primo) {
            System.out.println("\n[Número "+ numero+ " é primo]");
        }
        else {
            System.out.println("\n[Número "+ numero+ " não é primo]");
        }

        reader.close();

    }

    public static boolean verificar(int _numero) {
        if (_numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= _numero; i++) {
            if (_numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
