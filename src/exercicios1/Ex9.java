package exercicios1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        final int NUM_NOTAS = 3;
        final int MEDIA_APROVACAO = 7;
        final int MEDIA_EXAME = 5;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = ler.nextLine();

        System.out.print("Digite a 1ª nota: ");
        double nota1 = ler.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = ler.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3) / NUM_NOTAS;

        System.out.print(nomeAluno + " ");
        if (media >= MEDIA_APROVACAO) {
            System.out.println("aprovado!");
        } else if (media >= MEDIA_EXAME) {
            System.out.println("em exame!");
        } else {
            System.out.println("reprovado!");
        }

        ler.close();
    }
}
