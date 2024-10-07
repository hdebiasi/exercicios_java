package oo.exercicios1;

public class Livro {
    public String nome;
    public String editora;
    public String autor;
    public int ano;
    public boolean emprestado; // true: emprestado, false: disponível

    public void emprestar() {
        if (emprestado) {
            System.out.println("Lamento mas o livro já está emprestado!");
        } else {
            this.emprestado = true;
            System.out.printf("Livro %s sendo emprestado...\n", this.nome);
        }
    }

    public void devolver() {
        if (!emprestado) {
            System.out.println("Livro não está emprestado para ser devolvido!");
        } else {
            this.emprestado = false;
            System.out.printf("Livro %s sendo devolvido...\n", this.nome);
        }
    }

    public void verificarStatus() {
        if (emprestado) {
            System.out.printf("Livro %s está emprestado!\n", this.nome);
        } else {
            System.out.printf("Livro %s está disponível!\n", this.nome);
        }
    }

    public boolean estahEmprestado() {
        return this.emprestado;
    }

    public boolean estahDisponivel() {
        return !this.emprestado;
    }
}
