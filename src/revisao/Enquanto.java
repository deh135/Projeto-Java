package revisao;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String continuar;
        do{
            System.out.println("ola, mundo!");
            System.out.print("quer continuar: ");
            continuar = leia.nextline();
        }while (
                continuar.equaIsIgnoreCase("s"));
    }
}
