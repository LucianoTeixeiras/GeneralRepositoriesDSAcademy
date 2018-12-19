package Capitulo_05;

import regra.Executivo;
import regra.Funcionario;

public class Exercicio_04 {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Zeuler", "Magnun", "Developer", 1000F);
        System.out.println(String.format("%s terá um bônus de %f", f.getNome(), f.getBonus()));

        Executivo e = new Executivo("Jonas", "Saldanha", "Diretor", 2000F);
        System.out.println(String.format("%s terá um bônus de %f", e.getNome(), e.getBonus()));

    }

}
