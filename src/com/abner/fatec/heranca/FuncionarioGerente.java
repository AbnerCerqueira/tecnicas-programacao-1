package com.abner.fatec.heranca;

import java.util.Scanner;

// Objetivo: Criar a superclasse Funcionario e a subclasse Gerente
class Funcionario {
    private String nome, cpf;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Gerente extends Funcionario {
    private int senha = 123;
    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

}

public class FuncionarioGerente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente();

        System.out.print("Nome: ");
        gerente.setNome(scanner.nextLine());
        System.out.print("CPF: ");
        gerente.setCpf(scanner.nextLine());
        System.out.print("Salario: ");
        gerente.setSalario(scanner.nextDouble());
        System.out.print("Senha: ");
        int senha = scanner.nextInt();

        if (!gerente.autenticar(senha)) System.err.println("...Senha inválida");
        else System.out.println("...Gerente autenticado");
    }
}