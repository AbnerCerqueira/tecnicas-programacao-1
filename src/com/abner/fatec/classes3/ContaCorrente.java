package com.abner.fatec.classes3;

import java.util.Scanner;
import java.util.Random;

// Criar a classe para representar uma conta corrente, no programa voce pode fazer varias operações

class Conta {
    private String nome, flag;
    private int idade, numeroConta;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void saque(double saque) {
        if (saque > saldo) {
            System.out.printf("❌\nSeu saldo: R$ %.2f%nO quanto você quer sacar: R$ %.2f%nDEPOSITE MAIS\n❌\n", saldo, saque);
            return;
        }
        saldo -= saque;
        System.out.printf("Saque de R$ %.2f feito\n", saque);
    }

    public void extrato() {
        System.out.printf("✅\nNome: %s%nNúmero da conta: %s%nConta Conjunta: %s%nSaldo: R$ %.2f%n✅\n", nome, numeroConta, flag, saldo);
    }

    public void deposito(double deposito) {
        saldo += deposito;
        System.out.printf("R$ %.2f Depositados\n", deposito);
    }

}

public class ContaCorrente {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random gerador = new Random();

        System.out.print("Quantidade de clientes: ");
        int clientes = Integer.parseInt(s.nextLine());

        Conta[] contas = new Conta[clientes];

        for (int i = 0; i < contas.length; i++) contas[i] = new Conta();

        for (int i = 0; i < contas.length; i++) {
            System.out.printf("\tCliente %d\n", i + 1);

            System.out.print("Insira nome: ");
            contas[i].setNome(s.nextLine());

            System.out.print("Conta conjuta? ");
            contas[i].setFlag(s.nextLine());

            System.out.print("Insira Idade: ");
            contas[i].setIdade(Integer.parseInt(s.nextLine()));

            int nConta = gerador.nextInt(101) + 899;
            contas[i].setNumeroConta(nConta);
        }

        int acesso;
        while (true) {
            System.out.println();
            for (Conta conta : contas) {
                System.out.printf("%d - %s%n", conta.getNumeroConta(), conta.getNome());
            }

            System.out.println("Qual o número da sua conta?");
            int numeroConta = Integer.parseInt(s.nextLine());

            if (verifica(numeroConta, contas) < -1) {
                acesso = verifica(numeroConta, contas);
                System.out.println("Conta acessada com sucesso\uD83D\uDE04");
                int choice = menu(acesso, contas, s);
                if (choice == 4)
                    continue;
                break;
            }
            System.err.printf("CONTA %d NÃO EXISTE\n", numeroConta);
        }

    }

    static int verifica(int numeroConta, Conta[] contas) {
        int acesso = -1;
        for (int i = 0; i < contas.length; i++) {
            if (numeroConta == contas[i].getNumeroConta()) {
                acesso = i;
                break;
            }
        }
        return acesso;
    }

    static int menu(int acesso, Conta[] contas, Scanner s) {
        String menu = ("\nO que você quer fazer?\n1 - Depositar\n2 - Sacar\n3 - Exibir extrato\n4 - Trocar de conta\n5 - Sair");
        int choice = 0;
        do {
            System.out.println(menu);
            choice = Integer.parseInt(s.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Depositar quanto: ");
                    double deposito = Double.parseDouble(s.nextLine());
                    contas[acesso].deposito(deposito);
                    break;
                case 2:
                    System.out.print("Quanto deseja sacar: ");
                    double saque = Double.parseDouble(s.nextLine());
                    contas[acesso].saque(saque);
                    break;
                case 3:
                    contas[acesso].extrato();
                    break;
                case 4, 5:
                    System.out.println("Saindo\uD83D\uDC4B");
                    break;
                default:
                    System.err.printf("OPÇÃO %d INVÁLIDA", choice);
                    break;
            }

        } while (choice != 4 && choice != 5);
        return choice;
    }


}
