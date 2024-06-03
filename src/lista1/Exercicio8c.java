package lista1;

import java.util.Scanner;

public class Exercicio8c {
    public static void main(String[] args) {
        final int QUANTIDADE = 4;

        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[QUANTIDADE];

        for (int i = 0; i < QUANTIDADE; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            numeros[i] = ler.nextInt();
        }

        // Mostra os elementos do array
        System.out.println(java.util.Arrays.toString(numeros));

        // Ordena o array com o método bolha (bubble sort)
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

        System.out.println("O maior número digitado foi " + numeros[tamanho-1]);
        System.out.println("O menor número digitado foi " + numeros[0]);
    }
}
