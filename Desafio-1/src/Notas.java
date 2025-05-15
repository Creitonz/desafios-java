//4. Vetores
//Desafio:
//Crie um array de 5 notas (doubles). Calcule e imprima a média.
//Se a média for maior ou igual a 7, escreva "Aprovado". Senão, "Reprovado".

import java.util.ArrayList;

public class Notas {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(4.9);
        notas.add(7.0);
        notas.add(8.5);
        notas.add(3.2);
        notas.add(9.1);

        double somaDeNotas = 0;

//        for (int i = 0; i < notas.size(); i++) {
//            somaDeNotas += notas.get(i);
//        }

        for (double nota : notas) {
            somaDeNotas += nota;
        }

        double notaFinal = somaDeNotas / notas.size();

        if (notaFinal > 7) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }

    }
}
