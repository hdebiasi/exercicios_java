package exercicios1;

import java.util.Scanner;

public class Ex4a {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o seu sexo [M | F]: ");
        String sexo = ler.next().trim().toUpperCase().substring(0, 1);

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
