//Desafio 1:
//Crie uma classe Pessoa com os atributos nome (String), idade (int) e altura (double).
//Imprima esses dados no console formatados assim:
//Nome: João | Idade: 25 | Altura: 1.75m

//Desafio 2:
//Crie um programa que leia a idade de uma pessoa e imprima:
//"Menor de idade" se for menor que 18.
//"Maior de idade" se for 18 ou mais.
//"Idade inválida" se for menor que 0.

import java.util.Scanner;

public class Pessoa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Digite sua altura em metros: ");
        double altura = scanner.nextFloat();

        System.out.printf("Nome: %s | Idade: %d | Altura: %.2f ", nome, idade, altura );
        System.out.println("");

        if (idade < 0 ) {
            System.out.printf("%s, Idade inválida", nome);
        } else if (idade < 18) {
            System.out.printf("%s, você é menor de idade", nome);
        } else {
            System.out.printf("%s, você é maior de idade", nome);
        }
    }
}

