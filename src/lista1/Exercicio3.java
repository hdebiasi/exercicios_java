package lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Informe o segundo número.: ");
        int num2 = ler.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número: " + num1 + ", é o maior!");
        } else if (num2 > num1) {
            System.out.println("O segundo número: " + num2 + ", é o maior!");
        } else {
            System.out.println("Os 2 números são iguais!");
        }

        ler.close();
    }
}
