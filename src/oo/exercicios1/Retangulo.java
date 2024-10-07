package oo.exercicios1;

public class Retangulo {
    public int base, altura;

    public int calcularArea() {
        return base * altura;
    }

    public void imprimirArea() {
        int area = base * altura;
        System.out.println("Área = " + area);
    }
}
