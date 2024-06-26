package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int A = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int B = scanner.nextInt();


        if (A == B){
            int C = A + B;
            System.out.println(" Os valores são iguais. A soma de A e B é: " + C );
        } else if (A != B){
            int C = A * B;
            System.out.println(" Os valores nao são iguais, entao o valor multiplicado é: " + C);
        }

        scanner.close();
    }
}
