package exercicios1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        final int IDADE_MINIMA = 18;
        final int IDADE_MAXIMA = 67;

        Scanner ler = new Scanner(System.in);

        System.out.println("*** Descubra se você pode doar sangue ***");

        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();

        if (idade >= IDADE_MINIMA && idade <= IDADE_MAXIMA) {
            System.out.println("Pode doar sangue!");
        } else {
            System.out.println("Não pode doar sangue");
        }

        ler.close();
    }
}
