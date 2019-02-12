import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by suemareverton on 17/07/17.
 * Leitura de arquivos: BufferedReader
 */

public class Exercicio03 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader
                    (new FileReader("src/arquivo_de_teste_2.txt"));

            StringBuilder conteudo = new StringBuilder();
            String linha = null;
            while ((linha = bufferedReader.readLine()) != null)
                conteudo.append(linha).append("\n");

            System.out.println(conteudo.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException ex) {
                    // manipular IOException
                }
            }
        }
    }

}
