package br.com.fiap.aeroporto.model;

public class Voo {
    private String numeroVoo;
    private String dataVoo;
    private String origem;
    private String destino;
    private int tempoVooHoras;
    private Piloto piloto;
    private Aviao aviao;

    public Voo(String numeroVoo, String dataVoo, String origem, String destino, int tempoVooHoras, Piloto piloto, Aviao aviao) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
        this.origem = origem;
        this.destino = destino;
        this.tempoVooHoras = tempoVooHoras;
        this.piloto = piloto;
        this.aviao = aviao;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
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

    public int getTempoVooHoras() {
        return tempoVooHoras;
    }

    public void setTempoVooHoras(int tempoVooHoras) {
        this.tempoVooHoras = tempoVooHoras;
    }

    public void exibirInfo() {

        String nomePiloto = piloto.getNome();
        String nomeAviao = aviao.getModelo();
        String marcaAviao = aviao.getMarca();

        System.out.println("=== Exibindo Informações do Voo ===");
        System.out.println("NumeroVoo: " + getNumeroVoo());
        System.out.println("Data: " + getDataVoo());
        System.out.println("Origem: " + getOrigem());
        System.out.println("Destino: " + getDestino());
        System.out.println("Tempo de Voo: " + getTempoVooHoras());
        System.out.println("Piloto: " + nomePiloto);
        System.out.println("Avião: " + nomeAviao + " " + marcaAviao);
    }
}
