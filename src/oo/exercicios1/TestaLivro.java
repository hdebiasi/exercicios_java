package oo.exercicios1;

public class TestaLivro {
    public static void main(String[] args) {
        Livro java = new Livro();
        java.nome = "Java";
        java.autor = "James Gosling";
        java.ano = 2024;
        java.editora = "Java-lee";

        java.verificarStatus();
        System.out.println();

        java.emprestar();
        java.verificarStatus();
        System.out.println();

        if (java.estahEmprestado()) {
            System.out.println("Livro Java está atualmente emprestado!\n");
        }

        java.devolver();
        java.verificarStatus();
        if (java.estahDisponivel()) {
            System.out.println("Livro Java está disponível para empréstimo!");
        }
    }
}
