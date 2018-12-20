package Capitulo_05;

import regra.Calculadora;

public class Exercicio_06 {

    public static void main(String[] args) {

        //Maneira Tradicional

/*
        Calculadora calc1 = new Calculadora();

        calc1.setNum1(3);
        calc1.setNum2(7);

        System.out.println("A soma de 3 + 7 é: " + calc1.soma());
*/
        //Maneira Otimizada

        System.out.println("A soma de 3 + 7 é: " + Calculadora.soma(3,7));

        for (int i = 0; i < 50; i++) {
            Calculadora c = new Calculadora();
        }

        System.out.println(Calculadora.getTotalCalculadora());

    }
}
