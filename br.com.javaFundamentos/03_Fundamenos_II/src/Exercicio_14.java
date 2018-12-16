public class Exercicio_14 {

    private static void imprimeDe0AteN(int n){

        for (int i = 0; i <= n ; i++) {

            System.out.println(i);

        }

    }

    private static void imprimeDe0AteNRecursivo(int n){

        if (n == 0)
            return;
            imprimeDe0AteNRecursivo(n-1);
            System.out.println(n);
    }

    public static void main(String[] args) {
        //imprimeDe0AteN(10);
        imprimeDe0AteNRecursivo(100);
    }
}
