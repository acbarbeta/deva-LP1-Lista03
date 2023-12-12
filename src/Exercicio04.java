import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o nome do funcionário? ");
        String nomeFuncionario = input.nextLine();
        System.out.println("Quantas horas são trabalhadas em um mês? ");
        double horasTrabalhadasEmUmMes = input.nextDouble();
        System.out.println("Qual o valor da hora trabalhada?");
        double valorPorHora = input.nextDouble();
        CalculaSalario(nomeFuncionario, horasTrabalhadasEmUmMes, valorPorHora);
    }

    public static void CalculaSalario(String funcionario, double horasTrabalhadasEmUmMes, double valorHora) {
        final int MESES_NO_ANO = 12;
        String nomeFuncionario = funcionario;
        double salarioAnual = horasTrabalhadasEmUmMes * valorHora * MESES_NO_ANO;

        System.out.printf("Funcionário: %s%n", nomeFuncionario);
        System.out.printf("Salário anual: R$ %.2f%n", salarioAnual);

    }
}
