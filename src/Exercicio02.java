import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a temperatura a ser convertida: ");
        double temperaturaInicial = input.nextDouble();
        input.nextLine();
        System.out.println("Insira a unidade de medida atual: ");
        String unidadeAtual = input.nextLine();
        System.out.println("Insira a unidade de medida para a qual deseja converter: ");
        String unidadeFinal = input.nextLine();
        ConverterTemperatura(temperaturaInicial, unidadeAtual, unidadeFinal);
    }

    public static void ConverterTemperatura(double temperaturaAtual, String medidaAtual, String medidaFinal) {
        if (medidaAtual.equalsIgnoreCase("celsius") && medidaFinal.equalsIgnoreCase("kelvin")) {
            double temperaturaFinal = temperaturaAtual + 273.15;
            System.out.printf("%.2f K", temperaturaFinal);
        } else if (medidaAtual.equalsIgnoreCase("celsius") && medidaFinal.equalsIgnoreCase("fahrenheit")) {
            double temperaturaFinal = temperaturaAtual * 1.8 + 32;
            System.out.printf("%.2f ºF", temperaturaFinal);
        } else if (medidaAtual.equalsIgnoreCase("kelvin") && medidaFinal.equalsIgnoreCase("celsius")) {
            double temperaturaFinal = temperaturaAtual - 273.15;
            System.out.printf("%.2f ºC", temperaturaFinal);
        } else if (medidaAtual.equalsIgnoreCase("kelvin") && medidaFinal.equalsIgnoreCase("fahrenheit")) {
            double temperaturaFinal = (temperaturaAtual-273.15) * 1.8 + 32;
            System.out.printf("%.2f ºF", temperaturaFinal);
        } else if (medidaAtual.equalsIgnoreCase("fahrenheit") && medidaFinal.equalsIgnoreCase("celsius")) {
            double temperaturaFinal = (temperaturaAtual - 32) / 1.8;
            System.out.printf("%.2f ºC", temperaturaFinal);
        } else if (medidaAtual.equalsIgnoreCase("fahrenheit") && medidaFinal.equalsIgnoreCase("kelvin")) {
            double temperaturaFinal = (temperaturaAtual - 32) * (5 / 9) + 273.15;
            System.out.printf("%.2f K", temperaturaFinal);
        } else {
            System.out.println("Insira valores válidos para a conversão");
        }

    }

}
