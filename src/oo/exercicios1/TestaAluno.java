package oo.exercicios1;

public class TestaAluno {
    public static void main(String[] arg) {
        Aluno felipe = new Aluno();

        felipe.nome = "Felipe Czerniak";
        felipe.idade = 18;
        felipe.n1 = 9;
        felipe.n2 = 10;
        felipe.n3 = 10;
        felipe.n4 = 9;

        double media = felipe.calcularMedia();

        System.out.println("A média do aluno " + felipe.nome +
                " que tem " + felipe.idade + " anos é " + media
                );
        felipe.imprimirSituacao();
    }
}
