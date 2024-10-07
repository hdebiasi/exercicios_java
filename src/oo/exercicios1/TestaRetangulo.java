package oo.exercicios1;

public class TestaRetangulo {
    public static void main(String[] arg) {
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 5;
        retangulo.base = 10;

        System.out.println("Área = " + retangulo.calcularArea());
        retangulo.imprimirArea();
    }
}
