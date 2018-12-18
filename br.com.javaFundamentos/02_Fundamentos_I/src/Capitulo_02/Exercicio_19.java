package Capitulo_02;

public class Exercicio_19 {

    //Enums

    public static void main(String[] args) {

        //Operações

        // 1 - Soma
        // 2 - Subtração
        // 3 - Multiplicação
        // 4 - Divisão

        calcular(10, TipoOperacao.ADICAO, 15);

    }

    // Função

    private static void calcular(int operando1, TipoOperacao tipoOperacao, int operando2) {

        if (tipoOperacao == TipoOperacao.ADICAO)
            System.out.println(operando1 + operando2);
        else if (tipoOperacao == TipoOperacao.SUBTRACAO)
            System.out.println(operando1 - operando2);
        else if (tipoOperacao == TipoOperacao.MULTIPLICACAO)
            System.out.println(operando1 * operando2);
        else if (tipoOperacao == TipoOperacao.DIVISAO)
            System.out.println(operando1 / operando2);
        else System.out.println("Tipo Operação Inválida!!!");
    }
}

enum TipoOperacao {
    ADICAO, SUBTRACAO, MULTIPLICACAO, DIVISAO
}
