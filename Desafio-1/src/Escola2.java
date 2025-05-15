//Desafio 6 - Classes e Objetos
//Desafio:
//Crie uma classe Livro com título, autor e número de páginas.
//No main, crie 2 livros e exiba os dados de cada um.

//8. Encapsulamento
//Objetivo: proteger os dados da classe.
//O que fazer:
//Torne os atributos da classe Livro privados (private).
//Crie métodos get (para acessar) e set (para alterar) para cada atributo.
//No main, use o método set para alterar o título de um dos livros.
//Esses métodos dão controle sobre o que entra e sai da classe, evitando acessos diretos e acidentais.

public class Escola2 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 400 );
        livro1.setTitulo("Cento e Um Anos de Solidão");
        livro1.dados();
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void dados(){
        System.out.printf("Título: %s | Autor: %s | Número de páginas: %d\n", this.titulo, this.autor, this.numeroPaginas);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }
}