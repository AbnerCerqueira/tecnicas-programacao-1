package com.abner.fatec.classes2;
// Objetivo: fazer uma classe Retangulo com campos de altura e largura e com comportamento de calcular area,
// perimetro e diagonalR

import java.util.Scanner;

public class Retangulo {
    private double largura, altura;

    // setters
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // calculos
    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * largura + 2 * altura;
    }

    public double diagonal() {
        double diagonal;
        diagonal = Math.sqrt((largura * largura + altura * altura));
        return diagonal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        double area, perimetro, diagonal;

        System.out.print("Digite largura ");
        retangulo.setLargura(sc.nextDouble());
        System.out.print("Digite altura ");
        retangulo.setAltura(sc.nextDouble());

        area = retangulo.area();
        perimetro = retangulo.perimetro();
        diagonal = retangulo.diagonal();

        System.out.printf("AREA: %.2f%n", area);
        System.out.printf("PERIMETRO: %.2f%n", perimetro);
        System.out.printf("DIAGONAL: %.2f%n", diagonal);
    }
}
