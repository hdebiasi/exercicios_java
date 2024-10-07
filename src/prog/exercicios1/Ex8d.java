package prog.exercicios1;

import java.util.Scanner;

public class Ex8d {
    public static void main(String[] args) {
        final int NUM_VALORES = 4;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        int numero = ler.nextInt();

        // Inicializa as variáveis maior e menor na primeira entrada de dados
        int menor = numero;
        int maior = numero;

        for (int i = 2; i <= NUM_VALORES; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            numero = ler.nextInt();

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
