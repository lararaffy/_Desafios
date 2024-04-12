package _desafio4;

import javax.swing.*;

public class ContaPrincipal {
    public static void main(String[] args) {
        Conta conta;
        ContaServico contaServico = new ContaServico();
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) a sua Conta Bancária!");

        String inputNumero = JOptionPane.showInputDialog("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(inputNumero);

        String titularConta = JOptionPane.showInputDialog("Digite o nome do titular da conta.");

        String existeDeposito = JOptionPane.showInputDialog("Existe um depósito inicial (SIM/NÃO)? ");
        if (existeDeposito.equalsIgnoreCase("SIM")) {
            String inputQuantiaDeposito = JOptionPane.showInputDialog("Digite o valor inicial: ");
            double valorInicial = Double.parseDouble(inputQuantiaDeposito);
            conta = new Conta(numeroConta, titularConta, valorInicial);
        } else {
            conta = new Conta(numeroConta, titularConta);
        }

        JOptionPane.showMessageDialog(null, conta);

        String inputQuantia = JOptionPane.showInputDialog("Digite o valor do depósito: ");
        double quantia = Double.parseDouble(inputQuantia);
        contaServico.depositar(conta, quantia);

        JOptionPane.showMessageDialog(null, conta);

        inputQuantia = JOptionPane.showInputDialog("Digite o valor de saque: ");
        quantia = Double.parseDouble(inputQuantia);
        contaServico.sacar(conta, quantia);

        JOptionPane.showMessageDialog(null, conta);

        JOptionPane.showMessageDialog(null, "Obrigado por usar nosso serviço! Processo encerrado.");
    }
}


