package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println(imc);
        
        String condicao = "";

        if (imc < 18.5){
            condicao = "abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            condicao = "peso ideal, parabéns!";
        } else if (imc >= 25.0 && imc <= 29.9){
            condicao = "levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9){
            condicao = "obesidade grau 1";
        } else if (imc >= 35.0 && imc <= 39.9) {
            condicao = "obesidade grau 2 (severa) ";
        } else if (imc >= 40.0) {
            condicao = "obesidade grau 3 (mórbida) ";
        }

        System.out.printf("Seu IMC é: %.2f ", imc);
        System.out.println("e sua condicao é: " + condicao);
        
        scanner.close();
    }
}
