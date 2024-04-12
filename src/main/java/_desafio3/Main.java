package _desafio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean work = true;
        while (work) {

            Employee employee = new Employee();
            JOptionPane.showMessageDialog(null,"Bem-vindo(a) ao banco de funcionários!");
            String op = JOptionPane.showInputDialog(null,"1 - Adicionar funcionário \n " +
                    "2 - SAIR \n Insira a opção desejada: ");
            switch (op) {
                case "1": {

                    employee.nome = (JOptionPane.showInputDialog(null, "Insira o nome do funcionário: "));
                    employee.hora = (Double.parseDouble(JOptionPane.showInputDialog(null, "Insira quantas horas foram trabalhadas (P/dia): ")));
                    employee.valorH = (Double.parseDouble(JOptionPane.showInputDialog(null, "Valor pago por hora: ")));
                    double tx = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a taxa de imposto: "));
                    employee.tax = (tx / 100);
                    double bruto = Dadosf.calSB(employee.hora, employee.valorH);
                    employee.grossSalary = (bruto);
                    double aum = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a porcentagem do aumento: "));
                    employee.aumento = (aum / 100);
                    JOptionPane.showMessageDialog(null, "Dados do funcionário: \n " + employee);
                    JOptionPane.showMessageDialog(null, "Salário: \n " + "Imposto: " + (employee.tax * 100) + " % \n" +
                            "Porventagem de aumento: " + (employee.aumento * 100) + " % \n" + "Salário bruto: R$ " + bruto + "\n" +
                            "Salário líquido: R$ " + (Dadosf.netSalary(employee.grossSalary, employee.tax, employee.aumento)));
                    break;
                }
                case "2":{
                    work = false;
                    JOptionPane.showMessageDialog(null, "Encerrando programa...");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Programa concluído! Volte sempre.");
    }
}
