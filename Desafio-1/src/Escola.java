//Desafio Extra — Aluno e Média
//Classe Aluno com:
//Atributos: nome, nota1, nota2
//Construtor para os três
//Método calcularMedia() que retorna a média das notas
//Método situacao() que retorna "Aprovado" se média ≥ 6, senão "Reprovado"
//No main, crie um aluno e imprima o nome, a média e a situação

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Cleyton", 8.0, 6.5);
        aluno1.calcularMedia();
        aluno1.situacao();
    }
}

class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calcularMedia(){
        this.media = ((nota1 + nota2) / 2);
    }

    public void situacao() {
        if (this.media >= 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}