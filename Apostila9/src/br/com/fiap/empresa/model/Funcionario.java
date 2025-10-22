package br.com.fiap.empresa.model;

public class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salario;

    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$" + salario);
    }

    public double calculaBonus() {
        return salario * 0.2;
    }
}
