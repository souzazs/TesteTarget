public class questao_01 {
    public static void main(String[] args) throws Exception {
        int k, indice, soma;
        indice = 13;
        soma = 0;
        k = 0;

        while (k < indice) {
            k++;
            soma += k;
        }
        System.out.println("O valor da variável SOMA: " + soma);
    }
}
