import java.util.Calendar;
import java.util.Date;

public class Exercicio_24 {

    // Maniplação de Datas

    public static void main(String[] args) {

        // Obtendo um instância de um calendário

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        cal.setTime(new Date());

        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH) + 1;
        int ano = cal.get(Calendar.YEAR);

        System.out.println(dia + "/" + mes + "/" + ano);

        // ALterar o ano de uma data (da mesma forma outros campos pode ser manipulados

        cal.set(Calendar.YEAR, 2028);
        System.out.println(cal.toInstant().toString());

        // Manipulando datas

        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, -7);
        System.out.println(cal.toInstant().toString());

        Calendar outroCal = Calendar.getInstance();
        System.out.println(outroCal.after(cal));

    }
}
