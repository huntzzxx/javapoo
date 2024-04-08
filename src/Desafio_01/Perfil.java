package Desafio_01;

public class Perfil {
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
