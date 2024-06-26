package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores A e B
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();


        int temp = a;
        a = b;
        b = temp;

        System.out.println("------ realizando a troca ------");
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        scanner.close();
    }
}

//temp é uma variavel temporaria, assim tempo recebe A, A recebe B e B recebe temp