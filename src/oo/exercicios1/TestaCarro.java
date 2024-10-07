package oo.exercicios1;

public class TestaCarro {
    public static void main(String[] args) {
        Carro fordK = new Carro();
        fordK.modelo = "Ford K";
        fordK.ano = 2000;
        fordK.velocidadeAtual = 50;
        fordK.acelerar();
        fordK.acelerar();
        fordK.acelerar();
        fordK.frear();
        fordK.exibirVelocidadeAtual();

        Carro ferrari = new Carro();
        ferrari.modelo = "Ferrari";
        ferrari.ano = 2025;
        ferrari.velocidadeAtual = 200;

        for (int i=0; i<11; i++) {
            ferrari.acelerar();
        }
        ferrari.frear();
        ferrari.exibirVelocidadeAtual();

        for (int i=0; i<500; i++) {
            ferrari.frear();
        }
        ferrari.exibirVelocidadeAtual();
    }
}
