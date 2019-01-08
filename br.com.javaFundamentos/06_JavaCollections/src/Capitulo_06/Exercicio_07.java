package Capitulo_06;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exercicio_07 {

    public static void main(String[] args) {

        HashSet<String> cores = new HashSet<>();
        cores.add("Vermelho");
        cores.add("Verde");

        System.out.println("Inseriu Amarelo? " + cores.add("Amarelo"));
        System.out.println("Inseriu Amarelo? " + cores.add("Amarelo"));

        System.out.println(cores + " tem " + cores.size() + " elementos");

        for (String cor : cores){
            System.out.println(cor);
        }

        System.out.println("----------");

        TreeSet<String> cores2 = new TreeSet<>();
        cores2.add("Vermelho Escuro");
        cores2.add("Verde Escuro");
        cores2.add("Preto");
        cores2.add("Amarelo Escuro");
        cores2.add("Azul Escuro");
        cores2.add("Laranja Escuro");

        for (String cor : cores2){
            System.out.println(cor);
        }

        System.out.println("----------");

        SortedSet<String> coresMenorQuePreto = cores2.headSet("Preto");

        System.out.println(coresMenorQuePreto);

        coresMenorQuePreto = cores2.headSet("Preto", true);

        System.out.println(coresMenorQuePreto);

        System.out.println("----------");

        SortedSet<String> coresMaiorQuePreto = cores2.tailSet("Preto");

        System.out.println(coresMaiorQuePreto);

        String primeiraCor = cores2.first();
        System.out.println("A Primeira Cor é: " + primeiraCor);

        String ultimaCor = cores2.last();
        System.out.println("A Última Cor é: " + ultimaCor);

        SortedSet<String> coresDoMeio = cores2.subSet(primeiraCor, false, ultimaCor, false);
        System.out.println("As cores do Meio são: " + coresDoMeio);

    }
}
