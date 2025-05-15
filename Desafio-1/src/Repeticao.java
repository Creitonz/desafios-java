//3. Laços de Repetição
//Desafio:
//Mostre todos os múltiplos de 3 entre 1 e 100 usando for.
//Depois, repita com while.

public class Repeticao {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        int contador = 0;
        while(contador < 100){
            contador++;
            if (contador % 3 == 0) {
                System.out.println(contador);
            }
        }
    }
}
