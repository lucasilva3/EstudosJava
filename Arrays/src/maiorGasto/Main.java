package maiorGasto;

public class Main {
    public static void main(String[] args) {

        Integer[] gastos_pessoa_1 = { 71, 35, 94, 12, 90, 125, 2, 225, 109, 65, 124, 77 };
        Integer[] gastos_pessoa_2 = { 94, 90, 93, 7, 36, 87, 86, 194, 90, 55, 90, 68 };

        int soma_pessoa_1 = 0;
        for (Integer valor : gastos_pessoa_1) {
            soma_pessoa_1 += valor;
        }

        int soma_pessoa_2 = 0;
        for (int i = 0; i < gastos_pessoa_2.length; i++) {
            soma_pessoa_2 += gastos_pessoa_2[i];
        }

        if (soma_pessoa_1 == soma_pessoa_2) System.out.println("Pessoa 1 e Pessoa 2 gastaram a mesma quantidade.");
        else if (soma_pessoa_1 > soma_pessoa_2) System.out.println("Pessoa 1 gastou mais que Pessoa 2.");
        else if (soma_pessoa_1 < soma_pessoa_2) System.out.println("Pessoa 1 gastou menos que Pessoa 2.");

    }
}
