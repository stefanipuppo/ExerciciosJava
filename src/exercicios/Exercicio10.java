package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = {6, 7, 8};

        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("A media das notas é:" + media);

        scanner.close();
    }
}

// 1 etapa: declara um array com as notas
// 2 etapa: inicializa uma variavel soma com 0
// 3 etapa: for para somar todos os emelementos do array notas
// 4 etapa: calcula a media dividindo a soma pelo numero de elementos no array
// 5 etapa: exibe a media
