package Capitulo_05;

import regra.Executivo;
import regra.Funcionario;
import regra.Palestra;

import java.util.Date;

public class Exercicio_07 {

    public static void main(String[] args) {

        Executivo daniel =
                new Executivo("Daniel","Mendes", "CEO", 2000F);

        Funcionario suemar =
                new Funcionario("Suemar","Everton", "Desenvolvedor", 1000F);

//        Palestra palestra = new Palestra("A",new Date(),"Canoas", suemar);

        Palestra palestra = new Palestra("A",new Date(),"Canoas", daniel);

        System.out.println(palestra.getPalestrante().getNome() + " dará a palestra de " + palestra.getTitulo());
        System.out.println(palestra.getPalestrante().getNome() + " receberá " + palestra.getPalestrante().getBonus());
    }
}
