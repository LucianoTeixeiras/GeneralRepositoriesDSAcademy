package Capitulo_03;

public class Exercicio_05 {

    public static void main(String[] args) {

        // Obtem uma lista de números, soma e executa

        int total = 0;
        for (String arq : args){
            total += Integer.parseInt(arq);
        }

        System.out.println("A quantidade de parametros e: " + args.length);
        System.out.println("O total e: " + total);

        System.out.println("A media e: " + total / args.length);
    }
}
