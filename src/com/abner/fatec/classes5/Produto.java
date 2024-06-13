package com.abner.fatec.classes5;

// Objetivo: Criar classe produto e criar metodos para adicionare estoque e calcular valor, ultilizar construtor na main

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void adicionarEstoque() {
        quantidade++;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque() {
        quantidade--;
    }

    public void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nPreço: " + preco +
                "\nQuantidade em estoque: " + quantidade +
                "\nValor total em estoque: " + valorTotalEstoque();
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Abacaxi", 12.00);
        for (int i = 0; i < 5; i++) {
            produto.adicionarEstoque();
        }
        produto.removerEstoque();
        System.out.println(produto);
    }
}
