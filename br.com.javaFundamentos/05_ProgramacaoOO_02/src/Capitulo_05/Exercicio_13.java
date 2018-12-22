package Capitulo_05;

import regra.Aluno;
import regra.Pessoa;

public class Exercicio_13 {

    public static void main(String[] args) {

/*
        Pessoa p = new Pessoa();
        p.setNome("Luciano");
        p.setSobrenome("Teixeira");
        System.out.printf("O Nome Completo da pessoa é: " + p.getNomeCompleto());
*/

        Aluno a = new Aluno();
        a.setNome("Luciano");
        a.setSobrenome("Teixeira");
        a.setNumeroMatricula(2);
        System.out.printf("O Nome Completo do aluno é: " + a.getNomeCompleto());
    }
}
