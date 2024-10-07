package prog.exercicios2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1º número inteiro: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o 2º número inteiro: ");
        int num2 = leitor.nextInt();

        double media = (double) (num1 + num2) / 2;
//        double media = (num1 + num2) / 2d;        // Versão alternativa
        System.out.printf("Média entre %d e %d é %.2f", num1, num2, media);

        leitor.close();
    }
}
