package Capitulo_06;

import java.util.ArrayList;

public class Exercicio_06 {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Aluno joao = new Aluno("João", 10);
        pessoas.add(joao);

        pessoas.add(new Aluno("José",6));
        pessoas.add(new Instrutor(1,"Luciano",10000));

        Pessoa p = pessoas.get(0);
        System.out.println(p.getNome());

        Instrutor i = (Instrutor) pessoas.get(2);
        System.out.println(i.getNome() + " recebe " + i.getSalario());

        // Converter aluno em instrutor gera ClassCastException.

        // i = (Instrutor) pessoas.get(0);

        for (Pessoa pes : pessoas){
            if (pes instanceof Aluno)
                System.out.println("O Aluno " + p.getNome() + " tem a nota " + ((Aluno) pes).getNota());
            else if (pes instanceof Instrutor)
                System.out.println("O Instrutor " + i.getNome() + " tem o salário de: " + ((Instrutor) pes).getSalario());
        }
    }
}
