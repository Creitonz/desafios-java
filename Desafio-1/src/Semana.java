//Desafio 1 – Dias úteis
//Crie um enum DiaUtil com os dias de segunda a sexta.
//Cada dia deve ter o nome formatado (ex: "Segunda-feira").
//No main:
//Receba um número de 1 a 5.
//Mostre o dia correspondente formatado.

public class Semana {
    public static void main(String[] args) {
        int indice = 1;
        DiaUtil diautil = DiaUtil.values()[indice];
        System.out.printf("Dia útil: %s", diautil.getDiaFormatado());
    }
}

enum DiaUtil{
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feita");

    private String diaFormatado;

    DiaUtil(String diaFormatado){
        this.diaFormatado = diaFormatado;
    }

    public String getDiaFormatado(){
        return diaFormatado;
    }
}
