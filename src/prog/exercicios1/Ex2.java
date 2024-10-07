package prog.exercicios1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a distância percorrida (km): ");
        double distancia = ler.nextFloat();

        if (distancia > 0) {
            System.out.print("Informe a quantidade de combustível gasto (l): ");
            double combustivel = ler.nextFloat();

            if (combustivel > 0) {
                double consumo = (distancia / combustivel);
                System.out.println("Seu carro está fazendo a média de " + consumo + " km/l rodado");
            } else {
                System.out.println("Combustível precisa ser positivo!");
            }
        } else {
            System.out.println("Distância precisa ser positiva!");
        }

        ler.close();
    }
}
