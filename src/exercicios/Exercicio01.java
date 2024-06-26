package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.println("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double soma = A + B;

        boolean menorQueC = soma < C;

        System.out.println("O valor da soma é " + soma);
        System.out.println("A soma é menor que C? " + menorQueC);

        scanner.close();
    }
}
