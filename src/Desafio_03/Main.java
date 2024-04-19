package Desafio_03;

import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int ultimoChute;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação! Escolha entre um número de 0 a 100: ");
        int chute = sc.nextInt();
        if (chute == numeroAleatorio) {
            System.out.println("Parabéns! Você acertou! Com apenas um chute!");
            System.exit(0);
        }
        for (int i = 0; i < 100; i++) {
            if (chute < numeroAleatorio) {
                System.out.println("O número é maior que " + chute);
            }
            else {
                System.out.println("O número é menor que " + chute);
            }
            tentativas++;
            System.out.println("Tente novamente: ");
            ultimoChute = chute;
            chute = sc.nextInt();
            if (chute == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou! Com " + tentativas + " tentativas!");
                System.exit(0);
            }
            if (i == 99) {
                System.out.println("Você perdeu! O número era " + numeroAleatorio);
            }
            if (Math.abs(numeroAleatorio - chute) < Math.abs(numeroAleatorio - ultimoChute)) {
                System.out.println("Você está mais perto!");
            }
            else {
                System.out.println("Você está mais longe!");
            }
        }
    }
}