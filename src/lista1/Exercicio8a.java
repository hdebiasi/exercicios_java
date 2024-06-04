package lista1;

import java.util.Scanner;

public class Exercicio8a {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = ler.nextInt();

        System.out.print("Digite o segundo valor.: ");
        int b = ler.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int c = ler.nextInt();

        System.out.print("Digite o quarto valor..: ");
        int d = ler.nextInt();

        int maior = a;

        if ((b > a) && (b > c) && (b > d)) {
            maior = b;
        }

        if ((c > a) && (c > b) && (c > d)) {
            maior = c;
        }

        if ((d > a) && (d > b) && (d > c)) {
            maior = d;
        }

        int menor = a;

        if ((b < a) && (b < c) && (b < d)) {
            menor = b;
        }

        if ((c < a) && (c < b) && (c < d)) {
            menor = c;
        }

        if ((d < a) && (d < b) && (d < c)) {
            menor = d;
        }

        System.out.println("O maior número digitado foi " + maior);
        System.out.println("O menor número digitado foi " + menor);
    }
}
