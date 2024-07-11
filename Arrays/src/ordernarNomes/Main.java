package ordernarNomes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] nomes = { "JuliaNA", "rOgéRio", "Márcia", "aNA Paula", "LUiza", "Paulo", "Marcelo", "Ana clara", "vagner", "Victor" };

        // Deixando os nomes em caracteres maiúsculos
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].toUpperCase();
        }

        // Ordena os nomes em ordem alfabética
        Arrays.sort(nomes);

        System.out.println("[Nomes em ordem alfabética]");
        for (String n : nomes) {
            System.out.println("\t"+ n);
        }

    }
}
