package Capitulo_05;

public class Conta {

    public Conta(){
        saldo = 15;
    }

    public Conta(String titular){
        this();
        this.titular = titular;
        //saldo = 10;
    }

    public String titular;
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    /*public void setSaldo(float saldo) {
        this.saldo = saldo;
    }*/

    public void saca(float valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor Inválido para Saque! " + valor);
        }
        else if (saldo - valor < 0){
            throw new IllegalArgumentException("Saldo Insuficiente! " + valor);
        }
        else {
            saldo -= valor;
        }
    }

    public void deposita(float valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor Inválido para Depósito! " + valor);
        }
        else {
            saldo += valor;
        }
    }

    public void deposita(float valor, int emQuanosDias){
        if (emQuanosDias == 0){
            deposita(valor);
        }else {
            System.out.println("Depósito agendado!");
            // Código para agendar depósio
            // ...
        }
    }

    // Cliente recebe bônus pelo depósito
    public void depositaB(float valor, float bonus){
        deposita(valor + bonus);
    }
}
