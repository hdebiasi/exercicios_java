package lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        float combustivel, distancia, consumo;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a distância percorrida (km): ");
        distancia = ler.nextFloat();

        System.out.print("Informe a quantidade de combustível gasto (l): ");
        combustivel = ler.nextFloat();

        consumo = (distancia / combustivel);
        System.out.println("Seu carro está fazendo a média de : " + consumo + " km por litro rodado");

        ler.close();
    }
}
