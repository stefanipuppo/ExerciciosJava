package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua idade");
        double idade = scanner.nextDouble();

        if (idade >= 18) {
            System.out.println(nome + " você é maior de idade");
        } else if (idade < 18) {
            System.out.println(nome + " você é menor de idade");
        }
    }
}
