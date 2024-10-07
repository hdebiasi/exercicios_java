package prog.exercicios1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex7b {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite quanto o funcionário ganha por hora: ");
        int valorHora = ler.nextInt();

        if (valorHora < 0) {
            System.out.println("Valor da hora não pode ser negativo!");
        } else {
            System.out.print("Digite quantas horas o funcionário trabalha por mês: ");
            int numHorasMes = ler.nextInt();

            if (numHorasMes < 0) {
                System.out.println("Número de horas não pode ser negativo!");
            } else {
                // Instancia um objeto formatador de moeda
                Locale.setDefault(new Locale("pt", "BR"));
                NumberFormat nf = NumberFormat.getCurrencyInstance();

                double salarioTotal = valorHora * numHorasMes;
                System.out.println("Salário total: " + nf.format(salarioTotal));
            }
        }

        ler.close();
    }
}