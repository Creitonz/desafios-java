//9. Enum (Enumeração)
//Objetivo: representar constantes com significado.
//O que fazer:
//Crie um enum chamado DiaSemana com os dias da semana (SEGUNDA, TERÇA, etc.).
//No main, receba um número de 1 a 7 e mostre o dia correspondente.
//Use values()[numero - 1] para converter número em dia do enum (cuidado com índice).

import javax.crypto.interfaces.PBEKey;

public class Main2 {
    public static void main(String[] args) {
        int indice = 0;
        DiadaSemana hoje = DiadaSemana.values()[indice];
        System.out.printf("Hoje é: %s", hoje.getSemanaFormatado());
    }
}


enum DiadaSemana{
    SEGUNDA("Segunda"),
    TERÇA("Terça"),
    QUARTA("Quanta"),
    QUINTA("Quinta"),
    SEXTA("Sexta"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private String semanaFormatado;

    DiadaSemana(String semanaFormatado){
        this.semanaFormatado = semanaFormatado;
    }

    public String getSemanaFormatado(){
        return semanaFormatado;
    }
}



