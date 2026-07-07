package Heranca;

public class Carro extends Transporte {

    private final int LIMITE_VELOCIDADE = 200;

    public Carro(String nome, String marca, String modelo, int anoFabricaco, double preco, boolean isLigado){
        super(nome, marca, modelo, anoFabricacao, preco, isligado);
    }


    @Override
    public void acelerar() {
        System.out.printf("a velocidade maxima de um carro e {} km po hora.", LIMITE_VELOCIDADE);
        super.acelerar();
    }
}
