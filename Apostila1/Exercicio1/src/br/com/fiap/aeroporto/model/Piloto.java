package br.com.fiap.aeroporto.model;

public class Piloto {
    private String nome;
    private int idade;
    private String dataAdmissao;

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

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Piloto(String nome, int idade, String dataAdmissao) {
        this.nome = nome;
        this.idade = idade;
        this.dataAdmissao = dataAdmissao;
    }
}
