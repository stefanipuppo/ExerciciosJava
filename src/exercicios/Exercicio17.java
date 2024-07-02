package exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);

        scanner.close();
    }
}
