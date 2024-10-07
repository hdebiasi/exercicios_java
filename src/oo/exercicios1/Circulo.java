package oo.exercicios1;

public class Circulo {
    public final double PI = 3.14159;
    public String nome;
    public String cor;
    public double raio;

    public void calcularDiametro() {
        System.out.printf("Diâmetro: %.2f cm\n", this.raio * 2);
    }

    public void calcularPerimetro() {
        System.out.printf("Perímetro: %.4f cm\n", 2 * PI * this.raio);
    }

    public void calcularArea() {
        System.out.printf("Área: %.4f cm²\n", (PI * (this.raio * this.raio)));
    }
}
