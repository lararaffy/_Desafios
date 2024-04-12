package _desafio1;

import javax.swing.*;
public class _Exercicio1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) ao processador de números, " +
                "\n " +
                "para descobrir se qualquer número é +, - ou NEUTRO.");
        String inputNumero = JOptionPane.showInputDialog("Digite o número: ");
        int num = Integer.parseInt(inputNumero);

        if (num > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo.");
        }
        else if (num < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo.");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número é neutro.");
        }
    }
}

