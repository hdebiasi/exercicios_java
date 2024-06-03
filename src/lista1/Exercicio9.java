package lista1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = ler.nextLine();

        System.out.print("Digite a 1ª nota: ");
        double nota1 = ler.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = ler.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.print(nomeAluno + " ");
        if (media >= 7) {
            System.out.println("aprovado!");
        } else if (media >= 5) {
            System.out.println("em exame!");
        } else {
            System.out.println("reprovado!");
        }
    }
}
