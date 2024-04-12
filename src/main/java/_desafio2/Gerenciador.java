package _desafio2;

import javax.swing.*;
import java.util.HashMap;

public class Gerenciador {
    public static void main(String[] args) {
        HashMap<Integer, String> Tarefas = new HashMap<>();
        TarefasGerenciar tarefasGerenciar = new TarefasGerenciar();

        JOptionPane.showMessageDialog(null, "Bem-vindo(a) ao gerenciador de tarefas.");

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o que deseja fazer: "
                + "\n 1 - ANEXAR; " + "\n 2 - EDITAR; " + "\n 3 - DELETEAR; "));


        if (escolha == 1) {
            JOptionPane.showMessageDialog(null, "ANEXADO.");
        }
        else if (escolha == 2) {
            JOptionPane.showMessageDialog(null, "EDITADO.");
        }
        else if (escolha == 3) {
            JOptionPane.showMessageDialog(null, "DELETADO.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Opção INVÁLIDA. Rode o programa novamente");
        }
    }
}


