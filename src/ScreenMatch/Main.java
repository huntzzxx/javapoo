package ScreenMatch;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nEsse é o Screen Match");
        System.out.println("Filme: Homem-Aranha: Através do Aranhaverso");

        int anoDeLancamento = 2023;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.8;
        String genero = "Gênero: Ação/Infantil";
        System.out.println(genero);
        double media = (8.1 + notaDoFilme + 9.8) / 3;
        System.out.println("Média: " + media);

        int classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao + " estrelas");
    }
}