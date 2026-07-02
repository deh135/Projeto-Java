package Heranca;

public class Transporte {

    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int capacidade;
    private double custoManutencao;
    private int anofabricacao;
    private double preco;
    private boolean isLigado;

    public Transporte(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isLigado) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.anofabricacao = anoFabricacao;
        this.preco = preco;
        this.isLigado = isLigado;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getCustoManutencao() {
        return custoManutencao;
    }

    public int getAnoFabricacao() {
        return ;
    }

}
