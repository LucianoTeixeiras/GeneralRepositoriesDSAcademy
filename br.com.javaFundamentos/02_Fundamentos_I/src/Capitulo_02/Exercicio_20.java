package Capitulo_02;

import java.util.Date;

public class Exercicio_20 {

    //Formatação de Strings

    public static void main(String[] args) {

        String msg;
        String curso = "Java Fundamentos";
        double valorCurso = 123.456789;

        // Passando uma string como argumento

        msg = String.format("Bem vindo ao curso %s da DSAcademy!!!", curso);

        // Passando uma string e um int como argumento

        msg = String.format("Bem vindo ao curso %s da DSAcademy!!! Teremos %d vídeos!!!", curso, 200);

        // Passando uma string e um double como argumento

        msg = String.format("O Valor do curso é de: %f", valorCurso);
        msg = String.format("O Valor do curso é de: %.2f", valorCurso);

        Date dataAtual = new Date();
        msg = String.format("Hoje é %tD ", dataAtual);

        System.out.println(msg);

    }
}
