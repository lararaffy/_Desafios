package _desafio1._Exercicio2;

import javax.swing.*;

public class _Exercicio2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) aos dias da semana!");

        String numero = JOptionPane.showInputDialog(null, "Digite o número: ");
        int num = Integer.parseInt(numero);

        if (num == Constants.DOMINGO) {
            JOptionPane.showMessageDialog(null, "O dia é domingo.");
        } else if (num == Constants.SEGUNDA) {
            JOptionPane.showMessageDialog(null, "O dia é segunda-feira.");
        } else if (num == Constants.TERÇA) {
            JOptionPane.showMessageDialog(null, "O dia é terça-feira.");
        } else if (num == Constants.QUARTA) {
            JOptionPane.showMessageDialog(null, "O dia é quarta-feita.");
        } else if (num == Constants.QUINTA) {
            JOptionPane.showMessageDialog(null, "O dia é quinta-feira.");
        } else if (num == Constants.SEXTA) {
            JOptionPane.showMessageDialog(null, "O dia é sexta-feira.");
        } else if (num == Constants.SÁBADO) {
            JOptionPane.showMessageDialog(null, "O dia é sábado.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Número inválido. Tente novamente.");
        }
    }
}
