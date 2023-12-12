import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("***************");
        System.out.println("CALCULADORA");
        System.out.println("***************\n");

        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - Soma");
        System.out.println("2 - Substração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                Somar();
                break;
            case 2:
                Subtrair();
                break;
            case 3:
                Dividir();
                break;
            case 4:
                Multiplicar();
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

    }

    public static void Somar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        int soma = primeiroNumero + segundoNumero;

        System.out.printf("%d + %d = %d", primeiroNumero, segundoNumero, soma);
    }

    public static void Subtrair() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        int subtracao = primeiroNumero - segundoNumero;

        System.out.printf("%d - %d = %d%n%n", primeiroNumero, segundoNumero, subtracao);
    }

    public static void Dividir() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        int segundoNumero = 0;
        while (segundoNumero == 0) {
            System.out.println("Digite o segundo número");
            segundoNumero = input.nextInt();
            if (segundoNumero == 0) {
                System.out.println("Insira um número válido");
            }
        }
        double divisao = primeiroNumero / segundoNumero;

        System.out.printf("%d / % d = %.2f%n%n", primeiroNumero, segundoNumero, divisao);
    }

    public static void Multiplicar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        int multiplicacao = primeiroNumero * segundoNumero;

        System.out.printf("%d * %d = %d%n%n", primeiroNumero, segundoNumero, multiplicacao);
    }

}
