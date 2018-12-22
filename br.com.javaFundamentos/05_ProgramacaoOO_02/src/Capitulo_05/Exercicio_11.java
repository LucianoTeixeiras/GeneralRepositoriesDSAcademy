package Capitulo_05;

import regra.Aluno;

public class Exercicio_11 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Luciano");
        aluno1.setNumeroMatricula(1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Luciano");
        aluno2.setNumeroMatricula(1);

        if (aluno1.equals(aluno2)) {

            System.out.printf("É o mesmo aluno");
        }else {
            System.out.printf("Não é o mesmo aluno");
        }

    }
}
