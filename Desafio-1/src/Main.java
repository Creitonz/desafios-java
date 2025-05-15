public class Main {
    public static void main(String[] args) {
        IMC meuImc = new IMC(82.5, 1.69);
        meuImc.calcularIMC();
    }
}

class IMC {
    double peso;
    double altura;

    public IMC(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    public void calcularIMC(){
        double imc = (peso / (altura * altura));
        System.out.printf("Seu índice de massa corporal é: %.2f", imc);
    }
}