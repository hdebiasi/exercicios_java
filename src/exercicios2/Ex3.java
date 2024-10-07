package exercicios2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        final int BITS_EM_BYTE = 8;
        long bits = 0;
        boolean entradaCorreta = false;

        Scanner leitor = new Scanner(System.in);

        do {    // Repete bloco...
            System.out.print("Entre com o número de bits: ");

            if (leitor.hasNextLong()) {             // Long válido
                bits = leitor.nextLong();           // Atribui o valor lido à variável bits

                if (bits >= 0) {                    // Valor não é negativo
                    if (bits % BITS_EM_BYTE == 0) { // Valor é múltiplo de 8
                        entradaCorreta = true;

                        long bytes = bits / BITS_EM_BYTE;   // Converte bits em bytes
                        System.out.printf("%d bits corresponde a %d byte(s)", bits, bytes);
                    } else {
                        System.out.println("Entrada inválida! Número de bits deve ser múltiplo de 8!\n");
                    }
                } else {
                    System.out.println("Entrada inválida! Número deve ser >= 0\n");
                }
            } else {
                System.out.printf("Entrada inválida! Número deve ser <= %d.\n\n", Long.MAX_VALUE);
            }

            leitor.nextLine();      // Limpa o buffer de teclado
        } while (!entradaCorreta);  // ... enquanto entrada não for correta

        leitor.close(); // Libera recurso do Scanner
    }
}