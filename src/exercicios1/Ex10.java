package exercicios1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        final int DIAS_ANO = 365;
        final int CIGARROS_CARTEIRA = 20;

        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos anos faz que você fuma? ");
        int anosFumando = ler.nextInt();

        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosDia = ler.nextInt();

        System.out.print("Qual é o preço de uma carteira? ");
        double precoCarteira = ler.nextDouble();

        int cigarrosAno = cigarrosDia * DIAS_ANO;
        int totalCigarros = cigarrosAno * anosFumando;
        double numCarteiras = (double) totalCigarros / CIGARROS_CARTEIRA;
        double gastoTotal = numCarteiras * precoCarteira;

        System.out.printf("Em %d anos, você já gastou R$ %.2f", anosFumando, gastoTotal);

        ler.close();
    }
}
