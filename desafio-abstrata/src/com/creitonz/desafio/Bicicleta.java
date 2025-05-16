package com.creitonz.desafio;

public class Bicicleta extends Veiculo {

    public Bicicleta() {
        super(4);
    }

    @Override
    public void mover() {
        System.out.println("Bicicleta está pedalando");
    }
}
