package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int antecessor = numero -1;
        int sucessor = numero +1;

        System.out.println("O antecessor do numero é " + antecessor + " e o sucessor é " + sucessor);

        scanner.close();
    }
}
