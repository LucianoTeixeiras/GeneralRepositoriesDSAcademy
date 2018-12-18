package Capitulo_04;

public class Exercicio_01 {

    public static void main(String[] args) {
        Capitulo_04.Pessoa p = new Pessoa();
        p.nome = "Luciano";
        p.pais = "RS";
        p.sexo = "Macho";

        Pessoa p2;
        p2 = p;

        p2.nome = "Lucas";

        System.out.println(p.nome  + " mora no " + p.pais);
    }

}
