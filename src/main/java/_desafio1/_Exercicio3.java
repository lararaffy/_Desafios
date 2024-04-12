package _desafio1;

import javax.swing.*;

public class _Exercicio3 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bem-vindo ao programa de loop!");

        String num = JOptionPane.showInputDialog(null, "Digite um um número: ");
        int numero = Integer.parseInt(num);

        JOptionPane.showMessageDialog(null, "\nLoop FOR: ");
        for (int i = 0; i < numero; i++) {
            JOptionPane.showMessageDialog(null, "FOR: " + i);
        }

        JOptionPane.showMessageDialog(null, "\nLoop WHILE");
        int contWhile = 0;
        while (contWhile < numero) {
            JOptionPane.showMessageDialog(null, "WHILE: " + contWhile);
            contWhile++;
        }

        JOptionPane.showMessageDialog(null, "\nLoop DO-WHILE");
        int contDoWhile = 0;
        do {
            JOptionPane.showMessageDialog(null, "DO-WHILE: " + contDoWhile);
            contDoWhile++;
        } while (contDoWhile < numero);
    }
}













































