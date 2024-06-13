package com.abner.fatec.classes5;

public class Livro {
    private String titulo, autor, publicacao;

    public Livro() {
    }

    public Livro(String titulo, String autor, String publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nPublicacao: " + publicacao;
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Re:Zero - Começando uma Vida em Outro Mundo", "Tappei Nagatsuki", "24/01/2014");
        System.out.println(livro);
    }
}
