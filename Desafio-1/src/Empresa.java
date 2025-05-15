//Desafio 2 – Nível de Prioridade
//Crie um enum Prioridade com os níveis: BAIXA, MEDIA, ALTA.
//Cada um deve ter uma descrição:
//Ex: "Pouco urgente", "Importante", "Urgente".
//No main:
//Escolha um nível com base em um número de 1 a 3.
//Exiba a descrição correspondent

//Crie um enum StatusPedido com valores:
//PENDENTE("Pedido recebido")
//PROCESSANDO("Em preparação")
//ENVIADO("Saiu para entrega")
//ENTREGUE("Entregue com sucesso")
//No main:
//Mostre todos os status em ordem com as descrições.
//Depois simule uma mudança de status e imprima a nova fase.



public class Empresa {
    public static void main(String[] args) {
        int indice = 1;
        Prioridade prioridade = Prioridade.values()[indice];
        System.out.printf("Prioridade: %s\n\n", prioridade.getPrioridadeFormatado());

        for (int i = 0; i < StatusPedido.values().length; i++) {
            StatusPedido statusPedido = StatusPedido.values()[i];
            System.out.printf("Status: %s\n", statusPedido.getStatusFormatado());
        }
    }
}

enum Prioridade{
    BAIXA("Pouco urgente"),
    MEDIA("Importante"),
    ALTA("Urgente");

    private String prioridadeFormatado;

    Prioridade(String prioridadeFormatado){
        this.prioridadeFormatado = prioridadeFormatado;
    }

    public String getPrioridadeFormatado(){
        return prioridadeFormatado;
    }

}

enum StatusPedido{
    PENDENTE("Pedido recebido"),
    PROCESSANDO("Em preparação"),
    ENVIADO("Saiu para entrega"),
    ENTREGUE("Entregue com sucesso");

    private String statusFormatado;

    StatusPedido(String statusFormatado){
        this.statusFormatado = statusFormatado;
    }

    public String getStatusFormatado(){
        return statusFormatado;
    }
}