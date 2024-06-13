package com.abner.fatec.classes5;

import java.util.Scanner;

// Objetivo: Criar classe Estudante que tem notas(eu escolho na main a qtde de notas), calcular media com condições e exibir informações cm o toString()
public class Estudante {
    private String nome;
    private int idade;
    private float[] notas;

    public Estudante() {
    }

    public Estudante(String nome, int idade, int qtdeNotas) {
        this.nome = nome;
        this.idade = idade;
        notas = new float[qtdeNotas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNotas() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < notas.length; i++) {
            string.append("n").append((i + 1)).append(": ").append(notas[i]).append(" |");
        }
        return string.toString();
    }

    public void setNotas(float n) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = n;
        }
    }

    public String media() {
        float media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media = media / notas.length;
        if (media < 7) {
            return "Media: " + media + "\nVocê não foi aprovado \uD83D\uDC4E";
        }
        return "Media: " + media + "\nVocê foi aprovado \uD83D\uDC4D";
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nNotas: " + getNotas() +
                "\n" + media() + "\n";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante("Abner", 20, 4);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            estudante.setNotas(scanner.nextFloat());
        }

        System.out.println(estudante);
    }
}
