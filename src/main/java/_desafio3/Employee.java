package _desafio3;

public class Employee {
    public String nome;
    public double grossSalary;

    public double tax;
    public double hora;
    public double valorH;

    public double aumento;

    @Override
    public String toString() {
        return "Employee {" +
                "Nome: '" + nome + '\'' +
                ", horas trabalhadas por dia: " + hora +
                ", valor por hora: " + valorH +
                '}';
    }

}

