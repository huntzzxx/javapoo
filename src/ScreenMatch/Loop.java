package ScreenMatch;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira a nota do filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        mediaAvaliacao /= 3;
        String mediaFormatada = String.format("%.2f", mediaAvaliacao);
        System.out.println("A média de avaliações é de: " + mediaFormatada);
    }
}
