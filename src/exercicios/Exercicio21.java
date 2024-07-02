package exercicios;

import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {

        Random random = new Random();

        int valorAleatorio = random.nextInt(101);

        System.out.println("O valor aleatorio entre 0 e 100 é: " + valorAleatorio);


    }
}

//Random gera numeros aleatorios
// 101 porque o limite superior é obrigatorio