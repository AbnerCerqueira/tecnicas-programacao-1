package com.abner.fatec.heranca;

// Objetivo: Criar as classes Caminhao e Onibus que herdam da classe Veiculo
class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = Integer.parseInt(ano);
    }

    public void exibirDados() {
        System.out.printf("Placa: %s%nAno: %d%n", placa, ano);
    }
}

class Caminhao extends Veiculo {
    private int eixo;

    public Caminhao(String placa, int ano, int eixo) {
        super(placa, ano);
        this.eixo = eixo;
    }

    public int getEixo() {
        return eixo;
    }

    public void setEixo(int eixo) {
        this.eixo = eixo;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Placa: %s%nAno: %d%nEixo: %d%n", super.getPlaca(), super.getAno(), eixo);
    }
}

class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibirDados() {
        System.out.printf("Placa: %s%nAno: %d%nAssentos: %d%n", super.getPlaca(), super.getAno(), assentos);
    }
}

public class VeiculoTeste {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("1234", 2024, 123);
        System.out.println("Caminhao:");
        caminhao.exibirDados();

        Onibus onibus = new Onibus("4321", 2020, 50);
        System.out.println("\nOnibus");
        onibus.exibirDados();
    }
}