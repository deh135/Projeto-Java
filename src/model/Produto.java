package model;

public class Produto {
    //Atributos

    public String nome;
    public double preco;
    public int quantidadeEstoque;

    //Metodos

    public void mostrarEstoque(){
        System.out.println("nome: " + this.nome);
        System.out.println("preco: " + this.preco);
        System.out.println("qunatidade de estoque: " + this.quantidadeEstoque);
    }
public int adicionarAoEstoque(int quantidade){
        this.quantidadeEstoque += quantidade; //Atualiza valor de estoque

    }



}
