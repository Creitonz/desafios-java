//Crie uma classe Produto com:
//Atributos: nome, preco, quantidade
//Construtor para inicializar os três
//Metodo exibirInfo() que imprime os dados
//No main, crie dois produtos e chame exibirInfo() neles.



public class Loja {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 24.90, 10);
        produto1.exibirInfo();
    }
}

class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome,double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo(){
        System.out.printf("Nome: %s | Preço: %.2f | Quantidade: %d\n", this.nome, this.preco, this.quantidade);
    }
}
