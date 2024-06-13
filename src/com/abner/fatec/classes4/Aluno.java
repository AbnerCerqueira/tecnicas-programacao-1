package com.abner.fatec.classes4;

// Objetivo: classe Aluno que tem os campos de notas e metodo que mostra se o aluno foi aprovado ou nao
public class Aluno {
    private String nome;
    private double n1, n2, n3, totalNotas;

    public Aluno(String nome, double n1, double n2, double n3) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        totalNotas = n1 + n2 + n3;
    }

    public boolean minimo(double totalNotas) {
        return totalNotas >= 60;
    }

    public void aprovar() {
        System.out.printf("NOTA FINAL: %.2f%n", totalNotas);
        if (minimo(totalNotas)) {
            System.out.println("APROVADO");
            return;
        }
        System.out.printf("REPROVADO%nFALTARAM %.2f%n", 60 - totalNotas);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Abner", 27, 31, 0);
        aluno.aprovar();
    }
}
