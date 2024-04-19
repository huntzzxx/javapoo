package ScreenMatch;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Insira a nota do filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }
        if (totalNotas == 0) {
            System.out.println("Insira pelo menos uma nota.");
            System.exit(0);
        }
        mediaAvaliacao /= totalNotas;
        String mediaFormatada = String.format("%.2f", mediaAvaliacao);
        System.out.println("A média de avaliações é de: " + mediaFormatada);
    }
}