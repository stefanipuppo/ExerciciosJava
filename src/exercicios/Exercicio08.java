package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Digite um valor: ");
            valores[i] = scanner.nextInt();
        }

        Arrays.sort(valores);
        int numero1 = valores[2];
        int numero2 = valores[1];
        int numero3 = valores[0];

        System.out.println("Valores em ordem decrescente:" + numero1 + "," + numero2 + "," + numero3);

        scanner.close();

    }
}
