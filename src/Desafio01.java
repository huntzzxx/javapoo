import java.util.Scanner;

class Perfil {
    private String nome;
    private int idade;

    public Perfil(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirPerfil() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Olá " + nome + " tudo bem?\nPor favor insira sua idade: ");
        int idade = scanner.nextInt();
        Perfil perfilUsuario = new Perfil(nome, idade);
        System.out.println("\nPerfil cadastrado:");
        perfilUsuario.exibirPerfil();
        scanner.close();
    }
}