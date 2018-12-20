package regra;

public class Calculadora {

    //Maneira Tradicional

/*
    private int num1;
    private int num2;

    public int soma(){
        return num1 + num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
*/

    //Maneira Otimizada

    private static int totalCalculadora = 0;

    public Calculadora(){
        totalCalculadora++;
    }

    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static int getTotalCalculadora() {
        return totalCalculadora;
    }
}
