package exercicios1;

import java.util.Scanner;

public class Ex8e {
    public static void main(String[] args) {
        final int NUM_VALORES = 4;
        int maior, menor;

        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[NUM_VALORES];

        for (int i = 1; i <= NUM_VALORES; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            numeros[i-1] = ler.nextInt();
        }

        // Inicializa as variáveis maior e menor na primeira entrada de dados
        maior = menor = numeros[0];

        // Percorre o array procurando pelo maior e menor elemento
        for (int i = 0; i < NUM_VALORES; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else {
                menor = numeros[i];
            }
        }

        System.out.println("O maior número digitado foi " + maior);
        System.out.println("O menor número digitado foi " + menor);
    }
}
