package Capitulo_04;

public class Exercicio_02 {
    public static void main(String[] args) {

        Pessoa pessoa = null;
        pessoa = new Pessoa();
        pessoa.nome = "Joao";
        if (pessoa != null)
            System.out.println(pessoa.nome);

        //pessoa = new Pessoa();
        //System.out.println(pessoa.nome.length());
    }
}
