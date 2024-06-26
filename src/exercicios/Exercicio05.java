package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salario = scanner.nextDouble();
        System.out.println("O valor do seu salario é: " +salario);

        double salarioMinimo = 1293.20;
        System.out.println("O valor do salario minimo é: " +salarioMinimo);

        double resultado = salario / salarioMinimo;
        System.out.printf("O total de salarios minimos que você recebe é %.1f", resultado);

        scanner.close();
    }
}
