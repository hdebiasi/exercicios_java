package exercicios1;

import java.util.Scanner;

public class Ex8c {
    public static void main(String[] args) {
        final int NUM_VALORES = 4;

        Scanner ler = new Scanner(System.in);
        int numero, menor = 0, maior = 0;

        for (int i = 1; i <= NUM_VALORES; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            numero = ler.nextInt();

            // Inicializa as variáveis maior e menor na primeira entrada de dados
            if (i == 1) {
                maior = menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            } else {
                menor = numero;
            }
        }

        System.out.println("O maior número digitado foi " + maior);
        System.out.println("O menor número digitado foi " + menor);
    }
}
