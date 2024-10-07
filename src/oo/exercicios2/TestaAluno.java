package oo.exercicios2;

public class TestaAluno {
    public static void main(String[] arg) {
        Aluno fulano = new Aluno();
        fulano.setNome("Fulano");
        fulano.setIdade(18);
        fulano.setN1(9);
        fulano.setN2(10);
        fulano.setN3(10);
        fulano.setN4(9);

        System.out.printf("A média do aluno %s que tem %d anos é de %.2f\n",
                fulano.getNome(),
                fulano.getIdade(),
                fulano.calcularMedia()
        );
        fulano.imprimirSituacao();
        System.out.println();

        //----

        Aluno beltrano = new Aluno("Beltrano", 20, 5, 5, 5, 5);

        System.out.printf("A média do aluno %s que tem %d anos é de %.2f\n",
                beltrano.getNome(),
                beltrano.getIdade(),
                beltrano.calcularMedia()
        );
        beltrano.imprimirSituacao();
    }
}
