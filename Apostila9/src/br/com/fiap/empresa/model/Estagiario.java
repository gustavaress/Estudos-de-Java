package br.com.fiap.empresa.model;

public class Estagiario extends Funcionario{
    private String faculdade;

    public Estagiario(String nome, int matricula, double salario, String faculdade) {
        super(nome, matricula, salario);
        this.faculdade = faculdade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Faculdade: " + faculdade);
    }

    @Override
    public double calculaBonus() {
        return salario * 0;
    }
}
