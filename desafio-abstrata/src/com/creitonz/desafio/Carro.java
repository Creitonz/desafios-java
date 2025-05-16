package com.creitonz.desafio;

public class Carro extends Veiculo {

    public Carro() {
        super(3);
    }
    @Override
    public void mover(){
        System.out.println("Carro está se movendo");
    }

}
