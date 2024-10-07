package exercicios1;

import java.util.Scanner;

public class Ex8f {
    public static void main(String[] args) {
        final int NUM_VALORES = 4;

        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[NUM_VALORES];

        for (int i = 0; i < NUM_VALORES; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            numeros[i] = ler.nextInt();
        }

        // Mostra os elementos do array
        System.out.println(java.util.Arrays.toString(numeros));

        /* Ordena o array com o método bolha (bubble sort)
           O método bolha é muito eficiente, mas é simples de se entender, consistindo em
           analisar os elementos do array 2 a 2 e trocando suas posições se o elemento da
           direita for maior do que o da esquerda.
           A cada passada do laço externo (for i), o maior elemento é colocado à direita
         */

        int temp = 0;
        int tamanho = numeros.length;
        for(int i=0; i < tamanho; i++){
            for(int j=1; j < (tamanho-i); j++){
                if(numeros[j-1] > numeros[j]){
                    temp = numeros[j];
                    numeros[j] = numeros[j-1];
                    numeros[j-1] = temp;
                }
            }
        }

        // Mostra o array ordenado
        System.out.println(java.util.Arrays.toString(numeros));

        // Maior número é o último elemento do array
        // Menor número é o primeiro elemento do array
        System.out.println("O maior número digitado foi " + numeros[tamanho-1]);
        System.out.println("O menor número digitado foi " + numeros[0]);
    }
}
