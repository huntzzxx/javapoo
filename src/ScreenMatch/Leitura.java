package ScreenMatch;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe qual é o seu filme favorito: ");
        String filme = leitura.nextLine();
        //System.out.println(filme);
        System.out.println("Insira o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Insira a nota do filme: ");
        double notaDoFilme = leitura.nextDouble();
        System.out.println("Seu filme favorito é " + filme + " lançado no ano de " + anoDeLancamento + " e sua nota é " + notaDoFilme);
    }
}