package br.com.fiap.aeroporto.model;

public class Aviao {
    private String modelo;
    private String marca;
    private int ano;
    private boolean status;

    public Aviao(String modelo, String marca, int ano, boolean status) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.status = status;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
