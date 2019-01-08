package Capitulo_06;

import java.util.ArrayList;

public class Exercicio_05 {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        System.out.println("Tamanhp: " + alunos.size());
        System.out.println("Lista Vazia: " + alunos.isEmpty());

        alunos.add("Joao"); //Insere no final
        alunos.add(0,"Jose"); //Insere na posicao do index

        System.out.println("Tamanho: " + alunos.size());
        System.out.println("Lista vazia: " + alunos.isEmpty());

        String nome = "Maria";
        alunos.add(nome);

        //Loop-for

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }

        System.out.println("-----");

        for (String aluno : alunos){
            System.out.println(aluno);
        }

        System.out.println("-----");


    }
}
