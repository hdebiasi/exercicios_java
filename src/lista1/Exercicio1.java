package lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número: ");
        numero = ler.nextInt();

        System.out.println();
        System.out.println("O sucessor de " + numero + " é " + (numero + 1));
        System.out.println("O antecessor de " + numero + " é " + (numero - 1));

        ler.close();
    }
}
