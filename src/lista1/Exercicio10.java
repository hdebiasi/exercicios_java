package lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int ano, cig, prec, gasto;
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos anos faz que você fuma? ");
        ano = ler.nextInt();

        System.out.print("Quantos cigarros você fuma por dia? ");
        cig = ler.nextInt();

        System.out.print("Qual é o preço de uma carteira? ");
        prec = ler.nextInt();

        gasto = ((cig * (ano * 365)) / 20) * prec;

        System.out.println("Em " + ano + " anos, você já gastou R$ " + gasto);

        ler.close();
    }
}
