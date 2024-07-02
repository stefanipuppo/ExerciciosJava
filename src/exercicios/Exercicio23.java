package exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora de sua aula: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite o numero de aulas lecionadas por mes: ");
        int aulaMes = scanner.nextInt();

        System.out.println("Digite o porcentual de desconto do INSS: ");
        double porcertualINSS = scanner.nextDouble();

        double salarioBruto = valorHora * aulaMes;
        System.out.println("O salario bruto é de: " + salarioBruto);

        double descontoINSS = salarioBruto * (porcertualINSS / 100);

        double salarioLiquido = salarioBruto - descontoINSS;
        System.out.println("O salario liquido é: " + salarioLiquido);

        scanner.close();

    }

}
