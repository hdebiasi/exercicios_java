package lista1;

import java.util.Scanner;

public class Exercicio8b {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;

        // Inicializa a variável menor com o maior valor inteiro existente no Java
        int menor = Integer.MAX_VALUE;

        // Inicializa a variável maior com o menor valor inteiro existente no Java
        int maior = Integer.MIN_VALUE;

        /* A lógica por trás do algoritmo abaixo é que, qualquer valor que seja entrado
           pelo usuário na primeira vez, será mais alto que o valor da variável menor
           e será mais baixo do que o valor da variável maior, portanto, ambas serão
           atualizadas com os valores corretos
         */
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            numero = ler.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número digitado foi " + maior);
        System.out.println("O menor número digitado foi " + menor);
    }
}
