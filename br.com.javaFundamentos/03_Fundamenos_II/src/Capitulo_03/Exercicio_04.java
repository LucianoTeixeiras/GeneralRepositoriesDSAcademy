package Capitulo_03;

public class Exercicio_04 {

    public static void main(String[] args) {

        // Cada elemento do array é um array
        // Ou seja, temos array de arrays para representar uma matriz

        int[][] matriz;
        matriz = new int[3][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1 + j;

            }

        }

        // Inicializando uma Matriz
        int[][] matriz2 = {{10, 20}, {30, 40, 50}};
        int numeroCinquenta = matriz2[1][2];
        System.out.println(numeroCinquenta);

    }
}
