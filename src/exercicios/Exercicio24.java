package exercicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor das horas viajadas: ");
        double horasDeViagem = scanner.nextDouble();

        System.out.println("Digite a velocidade media: ");
        double velocidade = scanner.nextDouble();

        double distancia = horasDeViagem * velocidade;

        double litrosUsados = distancia / 12;

        System.out.println(" A distancia percorrida foi: " + distancia);
        System.out.println("A quantidade de litros usados foi " + litrosUsados);

        scanner.close();
    }
}
