package Capitulo_06;

public class Exercicio_01 {

    public static void main(String[] args) {

        String nome = "Joao";
        nome = nome + " Silva";
        System.out.println(nome);

        // StringBuilder 16 caracteres de capacidade
        StringBuilder sb1 = new StringBuilder();

        // StringBuilder 20 caracteres de capacidade
        StringBuffer sb2 = new StringBuffer(20);

        // StringBuilder 19 caracteres de capacidade
        StringBuilder sb3 = new StringBuilder("LTS");

        System.out.println("Tamanho: " + sb3.length());
        System.out.println("Capacidade: " + sb3.capacity());

        sb3.ensureCapacity(100);
        System.out.println("Nova Capacidade: " + sb3.capacity());

        String formacao1 = "Formação Cientista de Dados";
        float precoFormacao1 = 2000;

        sb3.append(" possui a promoção ")
                .append(formacao1)
                .append(" por ")
                .append(precoFormacao1);

        System.out.println(sb3.toString());
    }
}
