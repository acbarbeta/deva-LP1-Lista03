import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
