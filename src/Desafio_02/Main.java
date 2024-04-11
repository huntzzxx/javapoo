package Desafio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O valor inicial é em Celsius ou Fahrenheit? Insira C para Celsius e F para Fahrenheit.");
        String tipo = sc.nextLine();
        if (tipo.equals("C")) {
            System.out.println("Insira a temperatura em Celsius: ");
            double temp = sc.nextDouble();
            double temperatura = (temp * 1.8) + 32;
            String numeroFormatado = String.format("%.2f", temperatura);
            System.out.println("Sua temperatura em Celsius é " + temp + " e " + numeroFormatado + " em Fahrenheit.");
            System.exit(0);

        }
        if (tipo.equals("F")) {
            System.out.println("Insira a temperatura em Fahrenheit: ");
            double temp = sc.nextDouble();
            double temperatura = (5.0 / 9.0) * (temp - 32);
            String numeroFormatado = String.format("%.2f", temperatura);
            System.out.println("Sua temperatura em Fahrenheit é " + temp + " e " + numeroFormatado + " em Celsius.");
            System.exit(0);
        }
        else {
            System.out.println("Insira um valor válido. Insira C para Celsius e F para Fahrenheit.");
        }
    }
}