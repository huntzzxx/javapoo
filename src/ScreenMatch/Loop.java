package ScreenMatch;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira a nota do filme: ");
            double notaDoFilme = leitura.nextDouble();
        }
    }
}
