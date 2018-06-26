import java.util.Arrays;

public class Exercicio_02 {

    public static void main(String[] args) {

        // Inicializando os valores de um array na sua inicialização
        String[] nomes = {"Daniel", "Higor", "Suema"};
        int[] idades = {10, 20, 30};

        // Preenche os valores de um array
        Arrays.fill(idades, 10);

        idades[0] = 30;
        idades[1] = 10;
        idades[2] = 20;

        //Realizando uma busca linear
        int numeroAProcurar = 20;
        boolean achou = false;
        for (int idade : idades) {
            if (idade == numeroAProcurar) {
                achou = true;
                break;
            }
        }
        System.out.println("O Número " + numeroAProcurar + " está na lista? " + achou);

        // Fazendo uma busca binária no array
        // Para a busca binária funcionar, o array precisa estar ordenado
        int pontInsercao = Arrays.binarySearch(idades, 20);
        System.out.println(pontInsercao);

        // Imprimindo todos os elementos do array
        for (int idade : idades) {
            System.out.println(idade);
        }
    }
}
