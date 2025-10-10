package br.com.fiap.sistemapassagens.model;

public class Passagem {
    private double precoPassagem;
    private String origem;
    private String destino;
    private Passageiro Passageiro;

    // Constructors

    public Passagem(double precoPassagem, String origem, String destino) {
        this.precoPassagem = precoPassagem;
        this.origem = origem;
        this.destino = destino;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Passageiro getPassageiro() {
        return Passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        Passageiro = passageiro;
    }
}
