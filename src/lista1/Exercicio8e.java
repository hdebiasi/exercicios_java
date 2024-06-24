package lista1;

import java.util.Scanner;

public class Exercicio8e {
    public static void main(String[] args) {
        final int QUANTIDADE = 4;
        int maior, menor;

        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[QUANTIDADE];

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            numeros[i-1] = ler.nextInt();
        }

        // Inicializa as variáveis maior e menor na primeira entrada de dados
        maior = menor = numeros[0];

        for (int i = 0; i < 4; i++) {
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
