package prog.exercicios1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        final int IDADE_MINIMA = 16;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome.: ");
        String nome = ler.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();

        if (idade < IDADE_MINIMA) {
            System.out.println(nome + ", você não pode votar!");
        } else {
            System.out.println(nome + ", você está apto a votar");
        }

        ler.close();
    }
}
