//Coleções (ArrayList)
//Objetivo: usar lista dinâmica para armazenar dados.
//O que fazer:
//Crie uma ArrayList de nomes.
//Adicione 5 nomes com o método add().
//Use o for-each para imprimir cada nome.
//Coleções são essenciais quando você não sabe quantos itens vai ter e precisa de flexibilidade.

import java.util.ArrayList;

public class Nomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Cleyton");
        nomes.add("Kaio");
        nomes.add("Cleane");
        nomes.add("Franciane");
        nomes.add("José");

        String nomeatual;

        for (String nome : nomes) {
            nomeatual = nome;
            System.out.printf("Nome: %s\n", nomeatual);
        }
    }
}
