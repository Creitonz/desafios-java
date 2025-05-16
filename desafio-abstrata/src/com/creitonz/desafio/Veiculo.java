package com.creitonz.desafio;

public abstract class Veiculo {

    protected int idade;
    public Veiculo(int idade){
        this.idade = idade;
    }
    public abstract void mover();
    public void parar(){
        System.out.println("Veiculo parou");
    }
}
