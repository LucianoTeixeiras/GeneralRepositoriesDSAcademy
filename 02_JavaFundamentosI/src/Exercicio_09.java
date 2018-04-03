import java.util.Scanner;

public class Exercicio_09 {

    // Operadores Condicionais

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = reader.nextInt();

        if (idade < 0) {
            System.out.println("Idade Inválida!!!");
            System.out.println("Tente Novamente!!!");

        } else if (idade < 16)
            System.out.println("Não pode Votar!!!");
        else if (idade < 18 || idade > 65)
            System.out.println("Voto opcional!!!");
        else
            System.out.println("Voto obrigatório!!!");

    }
}
