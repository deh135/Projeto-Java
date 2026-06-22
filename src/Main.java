import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanne(Systemm.in);
/*
        comentarios de
 */
        String nome;
        int idade;

        System.out.print("digite seu nome");
        nome = leia.nextline();

        System.out.print("digite sua idade");
        idade = Integer.parpeInt(leia.nextline());

        System.out.printf("esse e o" + nome + "e ele tem" + idade + "anos");
    }
}
