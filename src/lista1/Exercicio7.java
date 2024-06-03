package lista1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite quanto o funcionário ganha por hora: ");
        int valorHora = ler.nextInt();

        System.out.print("Digite quantas horas o funcionário trabalha por mês: ");
        int numHorasMes = ler.nextInt();

        Locale.setDefault(new Locale("pt", "BR"));
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        double salarioTotal = valorHora * numHorasMes;
        System.out.println("Salário total: " + nf.format(salarioTotal));

        ler.close();
    }
}
