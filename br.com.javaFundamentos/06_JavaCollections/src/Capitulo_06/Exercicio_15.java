package Capitulo_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercicio_15 {

    public static void main(String[] args) {

                /*
            Um iterator permite remover um elemento de uma coleção durante um loop
        */

        List<String> cores = new ArrayList<>(Arrays.asList("Vermelho","Amarelo","Azul","Verde"));

        // Vamos remover as cores que começam pela letra 'A'

        //Ocorrerá uma exceção: ConcurrentModificationException
        /*for(String cor : cores) {
            if(cor.startsWith("A"))
                cores.remove(cor);
        }*/

        Iterator<String> i = cores.iterator();
        while(i.hasNext()) {
            String cor = i.next();
            if(cor.startsWith("A"))
                i.remove(); // Importante aqui... método remove do Iterator e não da lista
        }

        System.out.println(cores);

    }
}
