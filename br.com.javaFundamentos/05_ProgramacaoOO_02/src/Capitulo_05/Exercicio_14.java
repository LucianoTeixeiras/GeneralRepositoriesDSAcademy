package Capitulo_05;

import regranew.Animal;
import regranew.Cachorro;
import regranew.Gato;
import regranew.Pato;

public class Exercicio_14 {

    public static void main(String[] args) {

/*
        Pato pato = new Pato();
        Gato gato = new Gato();

        System.out.println(gato.som());
        System.out.println(pato.som());

*/

        Animal a = new Pato();
        System.out.println(a.som());

        a = new Gato();
        System.out.println(a.som());

        a = new Cachorro();
        System.out.println(a.som());

    }

}
