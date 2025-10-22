package br.com.fiap.empresa.model;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, int matricula, double salario, String departamento1) {
        super(nome, matricula, salario);
        this.departamento = departamento1;
    }

    @Override
    public void exibirDador() {
        super.exibirDados();
        System.out.println("Departameto: " + departamento);
    }

    @Override
    public double calculaBonus() {
        return salario * 0.25;
    }
}
