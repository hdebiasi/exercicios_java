package lista1;

import java.util.Scanner;

public class Exercicio8b {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            numero = ler.nextInt();

            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número digitado foi " + maior);
        System.out.println("O menor número digitado foi " + menor);
    }
}
