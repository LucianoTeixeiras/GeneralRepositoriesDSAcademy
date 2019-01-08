package Capitulo_06;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio_10 {

    public static void main(String[] args) {

        Queue fila = new LinkedList();
        fila.offer(new Instrutor(3, "Marcia", 1500));
        fila.offer(new Instrutor(2, "Vania", 3500));
        fila.offer(new Instrutor(1, "Aline", 1250));

        Instrutor instrutor = (Instrutor) fila.peek();

        System.out.println(instrutor.getNome());
        System.out.println(fila.size());

        instrutor = (Instrutor) fila.poll();
        System.out.println(instrutor.getNome());
        System.out.println(fila.size());

        System.out.println("Removendo Instrutor d Fila!!!");

        instrutor = (Instrutor) fila.remove();
        System.out.println(instrutor.getNome());
        System.out.println(fila.size());

        instrutor = (Instrutor) fila.poll();
        instrutor = (Instrutor) fila.poll();
        instrutor = (Instrutor) fila.poll();

        System.out.println(fila.size());

        Queue<Aluno> queue = new LinkedList<Aluno>();
        queue.remove();

    }
}
