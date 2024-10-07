package oo.exercicios1;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria fulano = new ContaBancaria();
        fulano.nome = "Fulano da Silva";
        fulano.saldo = 1_000;
        fulano.depositar(500);
        fulano.sacar(100);
        fulano.informarSaldo();

        ContaBancaria beltrano = new ContaBancaria();
        beltrano.nome = "Beltrano da Silva";
        beltrano.saldo = 5_000;
        beltrano.depositar(1_000);
        beltrano.sacar(10_000);
        beltrano.informarSaldo();
    }
}
