package Capitulo_05;

import regra.Executivo;

public class Exercicio_03 {

    public static void main(String[] args) {

        Executivo e = new Executivo("Luiz", "Freitas", "Analista", 5000F);
        System.out.println(e.getNome() + " terá um bonus de " + e.getBonus());
    }

}
