package AdivinharFilme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String[] dicas = new String[5];
        int numero_tentativas = 5;
        int proxima_dica = 0;
        String nome_filme_j2 = "";

        System.out.println("[Jogador 1 inserindo os dados]");
        System.out.print("\tNome do filme: ");
        String nome_filme_j1 = reader.nextLine();

        for (int i = 0; i < dicas.length; i++) {
            System.out.print("\tDica "+ (i + 1)+ ": ");
            String dica = reader.nextLine();
            dicas[i] = dica;
        }

        System.out.println("\n[Jogador 2 tentará adivinhar o filme]");
        while (numero_tentativas > 0 && !nome_filme_j1.equalsIgnoreCase(nome_filme_j2)) {
            System.out.print("\tNome filme: ");
            nome_filme_j2 = reader.nextLine();
            if (!nome_filme_j1.equalsIgnoreCase(nome_filme_j2)) {
                if (proxima_dica < dicas.length) {
                    System.out.println("\n[Palpite errado, atenção a dica]");
                    System.out.println("\t>>["+ dicas[proxima_dica]+ "]\n");
                    proxima_dica++;
                }
                numero_tentativas--;
            }
        }

        if (!nome_filme_j1.equalsIgnoreCase(nome_filme_j2)) {
            System.out.println("\n[Parabéns! Jogador 1 venceu]");
        }
        else {
            int pontuacao = switch (numero_tentativas) {
                default -> 0;
                case 5 -> 100;
                case 4 -> 80;
                case 3 -> 60;
                case 2 -> 40;
                case 1 -> 20;
            };
            System.out.println("\n[Parabéns! Jogador 2 venceu com "+ pontuacao+ " pontos]");
        }

        reader.close();

    }
}
