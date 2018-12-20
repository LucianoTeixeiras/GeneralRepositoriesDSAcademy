package Capitulo_05;

import regra.Conta;
import regra.Funcionario;

public class Exercicio_05 {

    public static void main(String[] args) {

        Funcionario f =
                new Funcionario("Silvio","Santos", "Nada", 1000, new Conta());

        f.getConta().deposita(100);

        System.out.println(f.getConta().getSaldo());

        Conta c = new Conta();
        c.deposita(200);

        f.setConta(c);

        System.out.println(f.getConta().getSaldo());

        Funcionario f2 = new Funcionario();

        System.out.println(f2.getConta().getSaldo());

    }
}
