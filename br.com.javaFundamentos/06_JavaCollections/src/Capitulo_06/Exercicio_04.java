package Capitulo_06;

public class Exercicio_04 {

    public static void main(String[] args) {

        System.out.println("Heap Size: " + Runtime.getRuntime().totalMemory());
        System.out.println("Heap Max Size: " + Runtime.getRuntime().maxMemory());

        String resultadoStr = "";
        for (int i = 0; i < 100000; i++) {
            resultadoStr = resultadoStr + " " + i;
            System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory());
        }

        // Demonstra a intenção de executar o coletor de lixo
        // Não garante que será executado imediatamente

        System.gc();

        System.out.println("FIM!!!");
    }
}
