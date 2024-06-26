package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorDoProduto = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.print("Digite o código da forma de pagamento: ");
        int codigoDePagamento = scanner.nextInt();

        double valorFinal;
        switch (codigoDePagamento) {
            case 1:
                valorFinal = valorDoProduto * 0.85;
                break;
            case 2:
                valorFinal = valorDoProduto * 0.90;
                break;
            case 3:
                valorFinal = valorDoProduto;
                break;
            case 4:
                valorFinal = valorDoProduto * 1.10;
                break;
            default:
                System.out.println("Codigo de pagamento invalido, tente novamente.");
                return;
        }

        System.out.printf("O valor final a ser pago é: R$ %.2f", valorFinal );

        scanner.close();
    }
}
