package Capitulo_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exercicio_10_Old {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/Exercicio10.java");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!!!");
            e.printStackTrace();
        }
    }
}
