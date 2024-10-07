package oo.exercicios1;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.nome = "Meu círculo";
        circulo.cor = "azul";
        circulo.raio = 1;

        System.out.printf("Raio do %s é %.2f cm\n", circulo.nome, circulo.raio);
        circulo.calcularDiametro();
        circulo.calcularArea();
        circulo.calcularPerimetro();
    }
}
