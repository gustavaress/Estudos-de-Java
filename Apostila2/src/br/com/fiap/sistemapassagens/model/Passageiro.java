package br.com.fiap.sistemapassagens.model;

public class Passageiro {
    private String nome;
    private int idade;
    private boolean maiorDeIdade;

    // Constructors
    public Passageiro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters and Setters
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

    public boolean getMaiorDeIdade() {
        return maiorDeIdade;
    }

    public void setMaiorDeIdade(boolean maiorDeIdade) {
        this.maiorDeIdade = maiorDeIdade;
    }

    // Metodo
    public boolean verificarMaiorDeIdade(int valorIdade) {
        if (valorIdade < 18) {
            return false;
        } else {
            return true;
        }
    }
}
