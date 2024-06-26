package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        double numero = scanner.nextDouble();

        double reajuste = numero * 0.05;
        double resultado = numero + reajuste;

        System.out.println("O reajuste do valor é: " + resultado);

        scanner.close();
    }
}
