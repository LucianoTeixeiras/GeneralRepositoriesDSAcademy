public class Exercicio_10 {

    // Escopo de Variáveis

    public static void main(String[] args) {

        int idade = 70;
        float preco = 200;

        if (idade >= 60) {

            //preco = preco / 100 * 90;
            float precoDesconto = preco / 100 * 90;
            System.out.println("Desconto de : " + (preco - precoDesconto));
            preco = precoDesconto;
        }

        exibirPrecoFinal(preco);

    }

    private static void exibirPrecoFinal(float paramPreco) {

        System.out.println("Preço final: " + paramPreco);

    }
}
