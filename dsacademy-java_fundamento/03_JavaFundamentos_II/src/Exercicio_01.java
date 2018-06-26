public class Exercicio_01 {

    public static void main(String[] args) {


        // Array

        // Problema: armazenar várioas valores do mesmo tipo

        //double salario1 = 123.0, salario2 = 456.0, salario3 = 789.0;

        // Declarando um array de strings
        double[] salarios;

        // Instanciando um array com 5 Posições
        // Importante: uma vez que o tamanho é definido, ele não pode ser alterado

        salarios = new double[5];

        // Escrevendo em uma posição do array
        salarios[3] = 1000;
        salarios[4] = 2000;

        // Linha abaixo não funciona, indice devera ser um inteiro
        // nomes[3.4] = "Everton";

        // Linha abaixo dá erro, pois extrapola o limite do array
        // salarios[5] = 20000;

        // Iterando para escrever um array
        // Primeira posição do array é = 0
        for (int i = 0; i < salarios.length; i++) {

            salarios[i] = 1000 * i;

        }

        // Iterando e acumulando o valor de todos os salários
        double totalSalarios = 0;

        for (double salario : salarios) {

            totalSalarios += salario;
        }

        double mediaSalarios = totalSalarios / salarios.length;

        System.out.println(String.format("A Média Salarial é: %f", mediaSalarios));

    }
}
