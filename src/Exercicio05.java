import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tempo gasto na viagem, em horas?");
        double tempoGasto = input.nextDouble();
        System.out.println("Qual a velocidade média durante a viagem, em km/h?");
        double velocidadeMedia = input.nextDouble();

        double distanciaPercorrida = calculaDistancia(tempoGasto, velocidadeMedia);
        double combustivelNecessario = calculaQuantidadeDeCombustivel(distanciaPercorrida);

        System.out.printf("Para a viagem, serão necessários %.3f L de combustível", combustivelNecessario);
    }

    public static double calculaDistancia(double tempoGasto, double velocidadeMedia) {
        double distanciaPercorrida = tempoGasto * velocidadeMedia;
        return distanciaPercorrida;
    }

    public static double calculaQuantidadeDeCombustivel(double distanciaPercorrida) {
        final int LITROS_GASTOS_POR_KM = 12;

        double litrosGastosNaViagem = distanciaPercorrida * LITROS_GASTOS_POR_KM;

        return litrosGastosNaViagem;
    }
}
