import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
    } {
        Scanner leia = new scanner (System.in);

        ystem.out.println("digite sua altura em metros: ");
        double altura = leia.nextDouble();

        System.out.println("digite um peso: ");
        double peso = leia.nextDouble();

        System.out.printf("o peso e = %.2f e a altura e = %.2f", peso, altura);

        double inc = peso / Math.pow(altura, 2); // altura * altura -> potencia

        if (imc < 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 & imc < 25) {
            System.out.println("**peso ideial (parabens)**");
        } else if (imc >= 25 & imc < 30) {
            System.out.println("**levemente acima do peso**");
        } else if (imc >= 30 & imc < 35) {
        }
}
