public class Exercicio_11 {

    private static int anosParaComletar100Anos(int idade) {

        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa!!!");
        }

        if (idade > 100)
            throw new IllegalArgumentException("Idade não pode se maior que 100");

        return 100 - idade;
    }

    public static void main(String[] args) {
        try {
            int anosRestantes = anosParaComletar100Anos(30);
            System.out.println(anosRestantes);
        } catch (IllegalArgumentException e) {
            System.out.println("Valor de idade inválido: " + e.getMessage());
        }
    }
}
