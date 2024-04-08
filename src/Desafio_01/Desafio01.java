package Desafio_01;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Olá " + nome + " tudo bem?\nPor favor insira sua idade: ");
        int idade = scanner.nextInt();
        Perfil perfilUsuario = new Perfil(nome, idade);
        System.out.println("\nDesafio_01.Perfil cadastrado:");
        perfilUsuario.exibirPerfil();
        scanner.close();
    }
}