package Capitulo_06;

import java.util.Set;
import java.util.TreeSet;

public class Exercicio_08 {

    public static void main(String[] args) {

        Set<Instrutor> instrutores = new TreeSet<>();
        instrutores.add(new Instrutor(1, "Marcia", 1500));
        instrutores.add(new Instrutor(2, "Vania", 3500));
        instrutores.add(new Instrutor(1, "Marcia", 1500));

        System.out.println(instrutores.size());

        for (Instrutor i : instrutores){
            System.out.println(i.getNome() + " => " + i.getSalario());
        }
    }
}
