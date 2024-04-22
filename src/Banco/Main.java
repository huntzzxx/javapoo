package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "João da Silva";
        String nDaConta = "2945-7";
        String tipoConta = "Corrente";
        double saldo = 1042.76;
        int opcao;
        int segOpcao;

        System.out.println("""
                            Bem vindo ao Banco de Goiânia!);
                            *************************************);
                            Dados iniciais do cliente:
                           """);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Conta N°: " + nDaConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("""
                            *************************************
                      
                            Operações disponíveis:""");
        System.out.println("""
                            1 - Consultar saldo
                            2 - Receber transferência
                            3 - Realizar depósito
                            4 - Sair
                            """);

        while (true) {
            System.out.println("\nDigite a opção desejada:");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Saldo atual: R$ " + saldo);
                    System.out.println("Deseja realizar alguma outra opção? 1 - Sim / 2 - Não");
                    segOpcao = sc.nextInt();
                    if (segOpcao == 1) continue;
                    if (segOpcao == 2) System.exit(0);
                    else {
                        System.out.println("Opção inválida!");
                        continue;
                    }
                }
                case 2 -> {
                    System.out.println("Digite o valor da transferência:");
                    double valor = sc.nextDouble();
                    saldo += valor;
                    System.out.println("Transferência recebida com sucesso no valor de R$ " + valor + "\nSaldo atual: R$ " + saldo);
                    System.out.println("Deseja realizar alguma outra operação? 1 - Sim / 2 - Não");
                    segOpcao = sc.nextInt();
                    if (segOpcao == 1) continue;
                    if (segOpcao == 2) System.exit(0);
                    else {
                        System.out.println("Opção inválida!");
                        continue;
                    }
                }
                case 3 -> {
                    System.out.println("Digite o valor do depósito:");
                    double valor = sc.nextDouble();
                    saldo += valor;
                    System.out.println("Depósito realizado com sucesso! No valor de R$ " + valor + "\nSaldo atual: R$ " + saldo);
                    System.out.println("Deseja realizar alguma outra operação? 1 - Sim / 2 - Não");
                    segOpcao = sc.nextInt();
                    if (segOpcao == 1) continue;
                    if (segOpcao == 2) System.exit(0);
                    else {
                        System.out.println("Opção inválida!");
                        continue;
                    }
                }
                case 4 -> {
                    System.out.println("Obrigado por utilizar o Banco de Goiânia!");
                    System.exit(0);
                }
            }
            if (opcao < 1 || opcao > 4) {
                System.out.println("""
                                    Opção inválida! Insira um valor válido.
                                    
                                    1 - Consultar saldo
                                    2 - Receber transferência
                                    3 - Realizar depósito
                                    4 - Sair""");
            }
        }
    }
}