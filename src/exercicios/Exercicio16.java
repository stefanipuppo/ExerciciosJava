package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de uma medida: (1 - 60)");
        int ladoA = scanner.nextInt();

        System.out.println("Digite o valor de uma medida: (1 - 60)");
        int ladoB = scanner.nextInt();

        System.out.println("Digite o valor de uma medida: (1 - 60)");
        int ladoC = scanner.nextInt();

        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("O triangulo é um equilatero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("O triangulo é isósceles");
        } else {
            System.out.println("O triangulo é escaleno");
        }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo válido.");
        }
        scanner.close();


    }
}
