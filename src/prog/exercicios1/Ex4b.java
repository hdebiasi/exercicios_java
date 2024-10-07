package prog.exercicios1;

import java.util.Scanner;

public class Ex4b {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o seu sexo [M | F]: ");
        char sexo = ler.next().trim().toUpperCase().charAt(0);

        if (sexo == 'M') {
            System.out.println("Sexo masculino");
        } else if (sexo == 'F') {
            System.out.println("Sexo feminino");
        } else {
            System.out.println("Entrada incorreta, tente novamente!");
        }

        ler.close();
    }
}
