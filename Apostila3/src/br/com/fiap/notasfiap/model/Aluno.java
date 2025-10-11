package br.com.fiap.notasfiap.model;

public class Aluno {
    private String nome;
    private int rm;

    public Aluno(String nome, int rm) {
        this.nome = nome;
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }
}
