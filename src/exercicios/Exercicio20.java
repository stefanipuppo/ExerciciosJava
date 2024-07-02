package exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        System.out.println("Tabuada do " + valor + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }

        scanner.close();
    }
}