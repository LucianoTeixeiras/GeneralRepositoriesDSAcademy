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

        // Perfrmance
        // Armazenar todos os números entre 1 e 10000

        long ti = System.currentTimeMillis();
        String resultadoStr = "";
        for (int i = 0; i < 500000; i++) {
            resultadoStr = resultadoStr + " " + i;
        }

        long tf = System.currentTimeMillis();
        System.out.println("Tempo de concatenação: " + (tf - ti));

        ti = System.currentTimeMillis();
        StringBuilder resultadoSb = new StringBuilder(200000);
        for (int i = 0; i < 500000; i++) {
            resultadoSb.append(" ").append(i);
        }

        tf = System.currentTimeMillis();
        System.out.println("Tempo de concatenação com StringBuilder: " + (tf - ti));
    }
}
