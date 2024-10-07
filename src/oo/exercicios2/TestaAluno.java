package oo.exercicios2;

public class TestaAluno {
    public static void main(String[] arg) {
        Aluno fulano = new Aluno();
        fulano.nome = "Fulano";
        fulano.idade = 18;
        fulano.n1 = 9;
        fulano.n2 = 10;
        fulano.n3 = 10;
        fulano.n4 = 9;

        System.out.printf("A média do aluno %s que tem %d anos é de %.2f\n",
                fulano.nome,
                fulano.idade,
                fulano.calcularMedia()
        );
        fulano.imprimirSituacao();
        System.out.println();

        //----

        Aluno beltrano = new Aluno("Beltrano", 20, 5, 5, 5, 5);

        System.out.printf("A média do aluno %s que tem %d anos é de %.2f\n",
                beltrano.nome,
                beltrano.idade,
                beltrano.calcularMedia()
        );
        beltrano.imprimirSituacao();
    }
}
