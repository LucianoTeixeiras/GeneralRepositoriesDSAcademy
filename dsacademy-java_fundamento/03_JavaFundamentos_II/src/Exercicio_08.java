import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Vamos fazer a divisão entre 2 números");

        System.out.println("Qual o primeiro valor?");
        int num1 = reader.nextInt();

        System.out.println("Qual o segundo valor?");
        int num2 = reader.nextInt();

        int resultado = 0;

        try {
            resultado = num1 / num2;
            System.out.println("O Resultad é: " + resultado);
        }
        catch (Exception e){
            System.out.println("Ocorreu um erro!!!" + e.getMessage());
        }
        finally {
            System.out.println("Bloco finally");
        }
    }
}
