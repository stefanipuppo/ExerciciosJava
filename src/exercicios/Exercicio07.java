package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma valor: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite outro valor: ");
        double numero2 = scanner.nextDouble();

        boolean resultado = numero1 > numero2;
        System.out.println(resultado);

        scanner.close();
    }
}
