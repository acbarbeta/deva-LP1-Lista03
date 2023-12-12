import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular seu fatorial: ");
        int numero = input.nextInt();
        CalculaFatorial(numero);
    }
    public static void CalculaFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;
        }
        System.out.printf("%d! = %d", numero, fatorial);
    }
}
