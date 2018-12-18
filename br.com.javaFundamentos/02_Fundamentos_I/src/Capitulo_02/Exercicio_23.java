package Capitulo_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio_23 {

    // Representação de Datas

    public static void main(String[] args) {

        // Data é java é representada basicamente como um numero (long)
        // que indica quantos milissegundos se passaram desde 01/01/1970

        Date dataAtual = new Date();
        System.out.println(dataAtual.getTime());
        System.out.println(dataAtual);

        Date outraAtual = new Date(0);
        System.out.println(outraAtual);

        outraAtual.setTime(2352525235L);
        System.out.println(outraAtual);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(dataAtual));

        SimpleDateFormat sdf2 = new SimpleDateFormat("D");
        System.out.println(sdf2.format(dataAtual));

        System.out.println(dataAtual.after(outraAtual));
        System.out.println(dataAtual.before(dataAtual));

    }
}
