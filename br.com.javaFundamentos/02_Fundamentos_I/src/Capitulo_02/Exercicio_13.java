package Capitulo_02;

import java.util.Scanner;

public class Exercicio_13 {

    // Estrutura de Repetição For

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("abuada de qual número???");
        int num = reader.nextInt();

        /*
            Para o comando For, especificar:
            1)  Variável de controle;
            2)  Critério de Continuação
            3)  Incremeno (ou decremento) da variável de controle
         */

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

    }
}
