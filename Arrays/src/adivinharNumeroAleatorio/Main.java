package adivinharNumeroAleatorio;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int numero_aleatorio = random.nextInt(10 - 1 + 1) + 1;
        int numero_inserido;
        boolean acertou = false;

        System.out.println("\tAdivinhe o número aleatório!");
        System.out.println("*Lembre-se que a cada erro, um número novo é gerado*\n");
        do {
            System.out.print("Insira um número entre 1 e 10: ");
            numero_inserido = reader.nextInt();

            if (numero_inserido < 1 || numero_inserido > 10) {
                System.out.println("\nPor favor, insira um valor válido!\n");
            }
            else {
                if (numero_aleatorio == numero_inserido) {
                    System.out.println("\nParabéns, você acertou o número aleatório gerado!");
                    System.out.println("\tNúmero aleatório: "+ numero_aleatorio);
                    System.out.println("\tNúmero inserido.: "+ numero_inserido+ "\n");
                    acertou = true;
                }
                else {
                    System.out.println("\nAhh! Você errou o número aleatório gerado.");
                    System.out.println("\tNúmero aleatório: "+ numero_aleatorio);
                    System.out.println("\tNúmero inserido.: "+ numero_inserido+ "\n");
                    random = new Random();
                    numero_aleatorio = random.nextInt(10 - 1 + 1) + 1;
                }
            }
        }
        while (!acertou);

        reader.close();

    }
}
