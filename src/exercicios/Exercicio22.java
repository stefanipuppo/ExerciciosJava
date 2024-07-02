package exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digie um valor: ");
        int valorA = scanner.nextInt();

        System.out.println("Digie outro valor: ");
        int valorB = scanner.nextInt();

        int quociente = valorA / valorB;
        System.out.println("o valor equociente é: " + quociente);

        int resto = valorA % valorB;

        System.out.println("O resto é: " + resto);
    }
}
