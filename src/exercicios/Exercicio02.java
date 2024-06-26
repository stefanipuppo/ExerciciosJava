package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

        System.out.println("-------");

        if (numero > 0 ) {
            System.out.println("O numero positivo");
        } else if (numero < 0) {
            System.out.println("O numero é negativo");
        }

        scanner.close();
    }
}
