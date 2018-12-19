package Capitulo_05;

import regra.Funcionario;

public class Exercicio_01 {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setNome("Lucioda");
        f.setSobrenome("Teixeira");

        f.setCargo("Analista");

        System.out.println(f.getNomeCompleto() + " é um " + f.getCargo());

    }
}
