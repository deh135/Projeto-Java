package model;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String tamanho;

    //Construtor de objetos vazio
    public Produto(){}

    //Construtor de objetos com parametro
    public Produto(String nome, double preco, int quantidadeEstoque, String tamanho){
        this.nome = nome;
        this.preco =preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.tamanho = tamanho;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double p){
        this.preco = p;
    }


    //Metodos
    public void mostrarEstoque(){
        System.out.println("nome: " + this.nome);
        System.out.println("preco: " + this.preco);
        System.out.println("Qunatidade em Estoque: " + this.quantidadeEstoque);
    }
public int adicionarAoEstoque(int quantidade){
        this.quantidadeEstoque += quantidade; //Atualiza valor de estoque
        return this.quantidadeEstoque; //Retorna valor de estoque atualidade
    }

}
