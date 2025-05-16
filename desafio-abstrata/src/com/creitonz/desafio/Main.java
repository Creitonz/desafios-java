package com.creitonz.desafio;

//Crie uma classe abstrata Veiculo com o método abstrato mover().
//Crie duas classes concretas: Carro e Bicicleta, que herdam de Veiculo.
//Cada uma deve implementar mover() com uma mensagem diferente (ex: "Carro está se movendo", "Bicicleta está pedalando").
//No main, crie instâncias e chame mover().

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Bicicleta bicicleta1 = new Bicicleta();

        System.out.println("Idade bicicleta: " + bicicleta1.idade);
        bicicleta1.mover();
        bicicleta1.parar();

        System.out.println("Idade carro: " + carro1.idade);
        carro1.mover();
        carro1.parar();

    }
}