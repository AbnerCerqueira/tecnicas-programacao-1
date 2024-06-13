package com.abner.fatec.polimorfismo;

// Objetivo: Criar a classe abstrata Figura e as figuras(quadado, circulo etc) herdando da Figura,
// preencher campos, fazer a operação de área e exibir as informações da classe com o toString()

abstract class Figura {
    String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

class Retangulo extends Figura {
    private double lado1, lado2;

    public Retangulo(double lado1, double lado2, String cor) {
        super.setCor(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retangulo" +
                "\nLado 1: " + lado1 +
                "\nLado 2: " + lado2 +
                "\nÁrea: " + String.format("%.2f", area()) +
                "\nCor: " + super.getCor() + "\n";
    }
}

class Quadrado extends Retangulo { // quadrado herda do retangulo
    public Quadrado(double lado, String cor) {
        super(lado, lado, cor); // usando construtor da superclasse
    }

    @Override
    public String toString() {
        return "Quadrado" +
                "\nLado: " + super.getLado1() +
                "\nÁrea: " + String.format("%.2f", area()) +
                "\nCor: " + super.getCor() + "\n";
    }
}

class Triangulo extends Figura {
    private double base, altura;

    public Triangulo(double base, double altura, String cor) {
        super.setCor(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo" +
                "\nBase: " + base +
                "\nAltura: " + altura +
                "\nÁrea: " + String.format("%.2f", area()) +
                "\nCor: " + super.getCor() + "\n";
    }
}


class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        super.setCor(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return 3.1415 * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo" +
                "\nRaio: " + raio +
                "\nÁrea: " + String.format("%.2f", area()) +
                "\nCor: " + super.getCor() + "\n";
    }
}

public class Figuras {
    public static void main(String[] args) {
        Figura retangulo = new Retangulo(10, 20, "Vermelho");
        System.out.println(retangulo);

        Figura quadrado = new Quadrado(10, "Amarelo");
        System.out.println(quadrado);

        Figura triangulo = new Triangulo(10, 10, "Azul");
        System.out.println(triangulo);

        Figura circulo = new Circulo(5, "Verde");
        System.out.println(circulo);
    }
}
