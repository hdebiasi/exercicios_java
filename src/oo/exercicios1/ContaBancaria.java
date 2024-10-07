package oo.exercicios1;

public class ContaBancaria {
    public String nome;
    public double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
        }
    }

    public void informarSaldo() {
        System.out.printf("Saldo atual de %s é R$ %.2f\n", this.nome, this.saldo);
    }
}
