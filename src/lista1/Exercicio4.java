package lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o seu sexo [M | F]: ");
        String sexo = ler.next().toUpperCase();

        if (sexo.equals("M")) {
            System.out.println("Sexo masculino");
        } else if (sexo.equals("F")) {
            System.out.println("Sexo feminino");
        } else {
            System.out.println("Entrada incorreta, tente novamente!");
        }

        ler.close();
    }
}
