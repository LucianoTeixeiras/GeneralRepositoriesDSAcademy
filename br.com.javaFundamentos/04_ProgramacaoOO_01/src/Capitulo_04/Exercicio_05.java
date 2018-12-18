package Capitulo_04;

public class Exercicio_05 {
    public static void main(String[] args) {

        Conta c = new Conta();
        c.titular = "Luciano";
        c.deposita(1000);
        c.saca(500);
        c.saca(600);

        System.out.println(String.format("O titular da conta, %s possui saldo de %f ", c.titular, c.getSaldo()));
    }
}
