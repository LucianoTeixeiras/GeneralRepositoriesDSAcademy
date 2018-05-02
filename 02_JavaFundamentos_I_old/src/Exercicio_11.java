import java.util.Scanner;

public class Exercicio_11 {

    // Estruturas de Repetição: While

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual número você quer???");
        int num = reader.nextInt();

        int i = 1;
        while (i <= 10){
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
    }
}
