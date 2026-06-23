public class escolhaCaso {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("escolhas uma das opcoes abaixo: ");
        System.out.println("""
                [1] SOMAR
                [2] SUBTRAIR
                [3] MULTIPLICAR
                [4] DIVIDIR
                [5] POTÊNCIA 
                [6] RAIZ QUADRADA
                [7] RESTO DA DIVISÃO
                [0] SAIR
                \s""" );
        System.out.print("Opcao: ");
        int opcao = leia.nextInt();
        System.out.println("digite o primeiro numero: ");
        double numero1 = leia.nextDouble();
        System.out.println("digite o segundo numero:" );
        double numero2 = leia.nextDouble();
        double resultado ;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            case 5:
                resultado = match.pow(numero1) + match.sqrt(numero2);
                break;
            case 6:
                resultado = match.sqrt(numero1) + match.sqrt(numero2);
                break;
            case 7:
                resultado = numero1 % numero2;
                break;
            case 0:
                break;
            default:
                System.out.println("opcao invalida");
        }
        System.out.printf("o resultado e igual a %.2f", resultado);
    }
}
