package Capitulo_04;

public class Exercicio_09 {
    public static void main(String[] args) {

        Conta c = new Conta();

        // Dposia 500 R$
        c.deposita(500);
        System.out.println(c.getSaldo());

        // Agenda o depósito para daqui a 2 dias, valor do saldo não é´liberado
        c.deposita(300,2);
        System.out.println(c.getSaldo());

        // Deposita com um Bônus
        c.depositaB(3000,50);
        System.out.println(c.getSaldo());
    }
}
