public class Exercicio_21 {

    // Manipulação de Strings Parte 01

    public static void main(String[] args) {

        // Obtendo um caracer de um String em uma posição específica

        String anotherPalindrome = "Niagara. O roar again";
        char aChar = anotherPalindrome.charAt(9);
        System.out.println(aChar);

        // Obtendo uma Sub-String de uma String

        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        // Dividindo (separando) o conteúdo de uma String

        String nomes = " João, José, Maria, Roberto, Silvia";
        String[] arrayNomes = nomes.split(",");
        for (String nome : arrayNomes)
            System.out.println(nome);

        // Obtendo o comprimento de uma String
        // Lembrando que o índice inicial (posição do promeiro elemento é 0)

        System.out.println(String.format("%s tem %d caracteres!!!", anotherPalindrome, anotherPalindrome.length()));

    }
}
