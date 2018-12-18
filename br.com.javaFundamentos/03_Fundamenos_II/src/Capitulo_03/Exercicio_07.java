package Capitulo_03;

public class Exercicio_07 {

    private static int soma2Numeros(int num1, int num2) {
        return num1 + num2;
    }

    private static int soma3Numeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    private static int somaNumeros(int... numeros) {
        int total = 0;
        for (int num : numeros) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Somando 2 Numeros: " + soma2Numeros(10, 20));
        System.out.println("Somando 3 Numeros: " + soma3Numeros(10, 20, 30));
        System.out.println("Somando N Numeros: " + somaNumeros(100, 200, 300, 400, 500));
    }

}
