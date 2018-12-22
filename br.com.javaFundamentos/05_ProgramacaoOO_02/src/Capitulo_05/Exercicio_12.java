package Capitulo_05;

import interfaces.Palestrante;
import regra.Palestra2;

import java.util.Date;

public class Exercicio_12 {

    public static void main(String[] args) {

        Palestra2 palestra = new Palestra2("ML", new Date(), "Campo Grande", new Palestrante() {
            @Override
            public float getBonusPalestras() {
                return 200;
            }
        });

        Palestrante palestrante = palestra.getPalestrante();
        System.out.printf(String.valueOf(palestrante.getBonusPalestras()));
    }
}
