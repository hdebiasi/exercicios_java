package exercicios2;

import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Digite o 1º número inteiro: ");
        String n2 = JOptionPane.showInputDialog("Digite o 2º número inteiro: ");

        if (n1 == null || n2 == null) {
            System.exit(0);
        } else {
            if (!n1.isEmpty() && !n2.isEmpty()) {
                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);

                double media = (double) (num1 + num2) / 2;

                String resposta = String.format("Média entre %d e %d é %.2f", num1, num2, media);
                JOptionPane.showMessageDialog(null, resposta);
            }
        }
    }
}
