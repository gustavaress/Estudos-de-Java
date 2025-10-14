package br.com.fiap.model;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int numeroPessoas;

    // Getter & Setter
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    // Métodos
    public void inicializa(int capacidade, int totalAndares) {
        setNumeroPessoas(0);
        setAndarAtual(0);
        setCapacidade(capacidade);
        setTotalAndares(totalAndares);
    }

    public void entra(){
        if(getNumeroPessoas() < getCapacidade()){
            setNumeroPessoas(getNumeroPessoas() + 1);
        } else {
            System.out.println("Elevador esta cheio!");
        }
    }

    public void sai(){
        if(getNumeroPessoas() > 0) {
            setNumeroPessoas(getNumeroPessoas() - 1);
        } else {
            System.out.println("O elevador esta vazio!");
        }
    }

    public void sobe(){
        if(getAndarAtual() >= getTotalAndares()){
            System.out.println("Andar máximo atingido");
        } else {
            setAndarAtual(getAndarAtual() + 1);
        }
    }

    public void desce(){
        if(getAndarAtual() <= 0){
            System.out.println("Você já esta no andar mais baixo");
        } else {
            setAndarAtual(getAndarAtual() - 1);
        }
    }
}
