package Capitulo_05;

public class Exercicio_10 {

    public static void main(String[] args) {

        // Igualando Strings


        String curso1 = "Java Fundamentos";
        String curso2 = "Java Fundamentos";

        if (curso1 == curso2)

            System.out.println("Nomes são iguais");
        else
            System.out.println("Nomes não são iguais");

        // Igualando Objetos

        String curso3 = new String("Java Fundamentos");
        String curso4 = new String("Java Fundamentos");

        if (curso3 == curso4)

            System.out.println("Nomes são iguais");
        else
            System.out.println("Nomes não são iguais");

        // Igualando Objetos Recomendado

        String curso5 = new String("Java Fundamentos");
        String curso6 = new String("Java Fundamentos");

        if (curso5.equals(curso6))

            System.out.println("Nomes são iguais");
        else
            System.out.println("Nomes não são iguais");

    }
}
