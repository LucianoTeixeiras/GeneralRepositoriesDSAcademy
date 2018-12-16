import java.util.Scanner;

public class Exercicio_14 {

    // Estrutura de Repetição com Alteração no Fluxo da Execução

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual Número");
        int num = reader.nextInt();

        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 1)
                continue;

            System.out.println(num + " * " + i + " = " + num * i);

            if (i > 7)
                break;
        }

        System.out.println("Fim da tabuada!!!");

    }
}
