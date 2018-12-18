package Capitulo_02;

import java.util.Scanner;

public class Exercicio_12 {

    // Estrutura de Repetição Do While

    public static void main(String[] args) {

        int idade;

        /*
            Sempre executa o bloco de repetição ao menos 1 vez pois o teste está no Final

            No caso de estrutura de repetiçãp While, o teste está no início, portanto
            o bloco de repetição pode não ser executado dependendo da condição
         */

        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Qual sua idade???");
            idade = reader.nextInt();
        }
        while (idade < 0);

        System.out.println("Faltam " + (100 - idade) + " para você chegar aos 100 anos!!!");
    }
}
