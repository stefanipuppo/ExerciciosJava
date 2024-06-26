package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite sua nota: ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < 4; i++){
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("A media das notas de Stefani é " + media);

        if (media > 7){
            System.out.println("Parabens, você foi aprovada");
        } else if (media < 6) {
            System.out.println("Sinto muito, você foi reprovada");
        }

        scanner.close();
    }
}
