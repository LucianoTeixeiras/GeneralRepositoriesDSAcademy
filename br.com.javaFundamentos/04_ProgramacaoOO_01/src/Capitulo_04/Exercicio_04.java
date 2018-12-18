package Capitulo_04;

public class Exercicio_04 {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.nome = "Joao";
        p.setIdade(85);

        System.out.println(String.format("%s possui %d anos", p.nome, p.idade, p.getIdade()));
    }
}
