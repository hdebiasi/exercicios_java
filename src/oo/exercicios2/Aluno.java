package oo.exercicios2;

public class Aluno {
    public String nome;
    public int idade;
    public double n1, n2, n3, n4;

    public Aluno() {
        this.nome = "";
        System.out.println("Criando um objeto...");
        System.out.println("\tConstrutor sem parâmetros...");
    }

    public Aluno(String nome, int idade, double n1, double n2, double n3, double n4) {
        this();

        this.nome = nome;
        this.idade = idade;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        System.out.println("\tConstrutor parametrizado...");
    }

    public double calcularMedia() {
        double media = (n1 + n2 + n3 + n4) / 4;
        return media;
    }

    public void imprimirSituacao() {
        double media = this.calcularMedia();
        if (media >= 7) {
            System.out.println(this.nome + " está aprovado!");
        } else {
            System.out.println(this.nome + " está reprovado!");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", n1=" + n1 +
                ", n2=" + n2 +
                ", n3=" + n3 +
                ", n4=" + n4 +
                '}';
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }
}
