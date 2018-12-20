package Capitulo_05;

import regra.*;

import java.util.Date;

public class Exercicio_09 {

    public static void main(String[] args) {

        Consultor c = new Consultor();
        c.setNome("Tanus");
        Palestra2 palestraML = new Palestra2("Machine Learning", new Date(), "Canoas", c);
        System.out.println("O Consultor " + c.getNome() + " receberá um bônus de " + c.getBonusPalestras());

        Executivo e = new Executivo("Vênus", "Solar", "CEO", 5000);
        Palestra2 palestraIA = new Palestra2("Inteligência Artificial", new Date(), "POA", e);
        System.out.println("O Executivo " + e.getNome() + " receberá um bônus de " + e.getBonusPalestras());

        Instrutor i = new Instrutor();
        i.setNome("Jonas");
        i.setCurso("Visão Computacional");
        Palestra2 palestraVC = new Palestra2("Visão Computacional", new Date(), "Sapucaia", i);
        System.out.println("O Instrutor " + i.getNome() + " receberá um bônus de " + i.getBonusPalestras());

        // Deve dar erro na implementação de Funcionario pois Funcionário não ministra Curos

        /*Funcionario f = new Funcionario();
        f.setNome("Maria");
        Palestra2 palestraDL = new Palestra2("Deep Learning", new Date(), "Porto Alegre", f);
        System.out.println("O Funcionário " + f.getNome() + " receberá um bônus de " + f.getBonusPalestras());*/

        // Dara erro caso não seja implementado a Interface Palestrante na classe Aluno
        Aluno a = new Aluno();
        a.setNome("Joca");
        Palestra2 palestraDS = new Palestra2("Data Science", new Date(), "Cuiabá");
        System.out.println("O Aluno " + a.getNome() + " receberá um bônus de " + a.getBonusPalestras());

    }

}
