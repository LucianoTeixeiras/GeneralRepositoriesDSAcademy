package Capitulo_06;

import java.util.*;

public class Exercicio_09 {

    public static void main(String[] args) {

        List<Instrutor> instrutores = new ArrayList<>();
        instrutores.add(new Instrutor(3, "Marcia", 1500));
        instrutores.add(new Instrutor(2, "Vania", 3500));
        instrutores.add(new Instrutor(1, "Aline", 1250));

        System.out.println("A Lista possui " + instrutores.size() + " Instrutores.");

        System.out.println("Ordenando por Matricula!!!");

        Collections.sort(instrutores);

        for (Instrutor i : instrutores){
            System.out.println(i.getNome() + " => " + i.getSalario());
        }

        System.out.println("----------");

        System.out.println("Ordenando por Nome!!!");

        Collections.sort(instrutores, new Comparator<Instrutor>() {
            @Override
            public int compare(Instrutor o1, Instrutor o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        for (Instrutor i : instrutores){
            System.out.println(i.getNome() + " => " + i.getSalario());
        }
    }
}
