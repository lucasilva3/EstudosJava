import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Insira um valor numérico: ");
        double valor_numerico = reader.nextDouble();

        String par_imp = (valor_numerico % 2 == 0) ? "par" : "ímpar";
        String pos_neg = (valor_numerico >= 0) ? "positivo" : "negativo";

        System.out.println("\n[Valor inserido é "+ par_imp+ " e "+ pos_neg+ "]");

    }
}
