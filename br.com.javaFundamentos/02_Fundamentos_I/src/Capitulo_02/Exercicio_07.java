package Capitulo_02;

import java.util.Scanner;

public class Exercicio_07 {

    // Estruturas de Decisao

    public static void main(String[] args) {

        // Fazer o importa da classe java.util.scanner

        Scanner reader = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = reader.nextInt();
        if (idade < 0)
            System.out.println("Idade Inválida!!!");
        else
            System.out.println("Ok, faltam " + (100 - idade + " para você chegar aos 100 anos!!!"));

    }
}
