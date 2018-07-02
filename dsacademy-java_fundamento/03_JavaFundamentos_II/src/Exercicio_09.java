import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Vamos fazer a divisão entre 2 números");

        try {

            System.out.println("Qual o primeiro valor?");
            int num1 = reader.nextInt();

            System.out.println("Qual o segundo valor?");
            int num2 = reader.nextInt();

            int resultado = 0;

            resultado = num1 / num2;

            System.out.println("O Resultad é: " + resultado);

        } catch (ArithmeticException ae) {
            System.out.println("Ocorreu um erro aritmético!!!");
        } catch (InputMismatchException ime) {
            System.out.println("Ocorreu um erro de argumento inválido!!!");
        } finally {
            System.out.println("Bloco finally");
        }
    }
}
