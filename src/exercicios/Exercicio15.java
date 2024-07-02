package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano em que voce nasceu");
        int ano = scanner.nextInt();
        System.out.println("Digite o mes em que voce nasceu");
        int mes = scanner.nextInt();
        System.out.println("Digite o dia em que voce nasceu");
        int dia = scanner.nextInt();

        System.out.println("-------------------------------");

        System.out.println("Digite o ano atual");
        int anoAtual = scanner.nextInt();
        System.out.println("Digite o mes atual");
        int mesAtual = scanner.nextInt();
        System.out.println("Digite o dia atual");
        int diaAtual = scanner.nextInt();

        int calculoAno = anoAtual - ano;
        int calculoMes = mesAtual - mes;
        int calculoDia = diaAtual - dia;

        if (calculoDia < 0) {
            calculoDia += 30;
            calculoMes -= 1;
        }

        if (calculoMes < 0){
            calculoMes += 12;
            calculoAno -= 1;
        }
        System.out.println(" você ja viveu " + calculoAno + " anos, " + calculoMes + " meses e " + calculoDia + " dias de vida");

    }
}
