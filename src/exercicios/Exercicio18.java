package exercicios;

public class Exercicio18 {
    public static void main(String[] args) {
        double alturaFrancisco = 1.50; // em metros
        double alturaSara = 1.10; // em metros

        double crescimentoAnualFrancisco = 0.02; // em metros
        double crescimentoAnualSara = 0.03; // em metros

        int anos = 0;

        while (alturaFrancisco <= alturaSara) {
            alturaFrancisco += crescimentoAnualFrancisco;
            alturaSara += crescimentoAnualSara;
            anos++;
        }


        System.out.println("Serão necessários " + anos + " anos para que Francisco seja maior que Sara.");
    }
}

// fiz o esse exercicio sem entender a proposta, ja que francisco ja é maior que sara