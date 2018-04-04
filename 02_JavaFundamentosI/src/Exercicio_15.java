public class Exercicio_15 {

    // Estrutura de Repetição com Alteração no Fluxo da Execução com Swith

    public static void main(String[] args) {

        int mes = 2;
        int ano = 2000;
        int numeroDias = 0;

        switch (mes){

            case 1:
                numeroDias = 31;
                break;
            case 2:
                if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0))
                    numeroDias = 29;

                    numeroDias = 28;
                break;
            case 3:
                numeroDias = 31;
                break;
            case 4:
                numeroDias = 30;
                break;
            case 5:
                numeroDias = 31;
                break;
            case 6:
                numeroDias = 30;
                break;
            case 7:
                numeroDias = 31;
                break;
            case 8:
                numeroDias = 31;
                break;
            case 9:
                numeroDias = 30;
                break;
            case 10:
                numeroDias = 31;
                break;
            case 11:
                numeroDias = 30;
                break;
            case 12:
                numeroDias = 31;
                break;
        }

        System.out.println("O Número de dias " + numeroDias);
    }
}
