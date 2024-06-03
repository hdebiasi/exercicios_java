package lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("*** Descubra se você pode doar sangue ***");

        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode doar sangue!");
        } else {
            System.out.println("Não pode doar sangue");
        }

        ler.close();
    }
}
