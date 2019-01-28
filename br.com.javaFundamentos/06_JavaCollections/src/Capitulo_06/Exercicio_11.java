package Capitulo_06;

import java.util.Stack;

public class Exercicio_11 {

    public static void main(String[] args) {

        Stack<Aluno> pilha = new Stack<>();
        pilha.push(new Aluno("Vera", 5));
        pilha.push(new Aluno("Clara", 8.5f));
        pilha.push(new Aluno("Melissa", 8));

        Aluno melissa = pilha.peek();
        System.out.println(melissa.getNome());

        melissa = pilha.pop();
        System.out.println(melissa.getNome());

        Aluno proximoAluno = pilha.pop();
        System.out.println(proximoAluno.getNome());

    }
}