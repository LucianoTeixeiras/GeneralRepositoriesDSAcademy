package Capitulo_05;

import regra.Funcionario;
import regra.Pessoa;

public class Exercicio_02 extends Pessoa {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Lucio", "Vargas", "CIO", 50000F);

        System.out.println(f.getNomeCompleto() + " é " + f.getCargo() + " e seu salário é de " + f.getSalario());
    }

}
