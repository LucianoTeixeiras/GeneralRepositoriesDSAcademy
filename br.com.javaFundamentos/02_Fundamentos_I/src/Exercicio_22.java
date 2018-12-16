public class Exercicio_22 {

    // Manipulação de Strings Parte 02

    public static void main(String[] args) {

        // Obtendo o comprimento de uma String
        // Lembrando que o índice inicial (posição do promeiro elemento é 0)

        String anotherPalindrome = "Niagara. O roar again";

        System.out.println(String.format("%s tem %d caracteres!!!", anotherPalindrome, anotherPalindrome.length()));

        // Convertendo para maiúsculo

        System.out.println("dsacademy é incrível!!!".toUpperCase());

        System.out.println("dsacademy é incrível!!!".toLowerCase());

        // Procurando a primeira ocorrência de uma susbtring em uma sring

        int primeiraOcorrencia = anotherPalindrome.indexOf("ga");
        System.out.println(primeiraOcorrencia);

        // Procurando a última ocorrência de uma susbtring em uma sring

        int ultimaOcorrencia = anotherPalindrome.lastIndexOf("ga");
        System.out.println(ultimaOcorrencia);

        // Verificando se uma String possui um Substring
        // Retorno do método contains booleano (verdadeiro ou falso)

        System.out.println("DSAcademy é incrível".contains("é"));
        System.out.println("DSAcademy é incrível".contains("Curso Ruim"));

        // Susbtituindo caracteres e realizando encadeamento

        String frase = "Seja-bem-vindo-ao-curso-de-java-fundamentos!!!"
                .replace('-', ' ')
                .replaceAll(" ", "  ")
                .replaceFirst("ja", "JA");

        System.out.println(frase);

    }
}
