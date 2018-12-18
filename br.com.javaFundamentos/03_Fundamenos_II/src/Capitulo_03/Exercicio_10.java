package Capitulo_03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio_10 {

    public static void imprimeArquivo(String nomeArquivo) throws IOException {

        FileInputStream fis = new FileInputStream("src/Exercicio10.java");

        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) {
        try {
            imprimeArquivo("src/Exercicio_08.java");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro!!!");
            e.printStackTrace();
        }
    }
}

