package ScreenMatch;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.8;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento recente!");
        }
        else {
            System.out.println("Lançamento retrô!");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Você pode assistir esse filme com seu plano atual!");
        }
        else {
            System.out.println("Você precisa alocar este filme para ter acesso a ele.");
        }
    }
}
