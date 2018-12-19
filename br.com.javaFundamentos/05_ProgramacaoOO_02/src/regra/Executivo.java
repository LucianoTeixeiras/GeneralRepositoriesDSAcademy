package regra;

public class Executivo extends Funcionario {

    private static final int BONUS_PERCENTUAL = 10;

    public Executivo(String nome, String sobrenome, String cargo, float salario) {
        super(nome, sobrenome, cargo, salario);
    }

    public float getBonus() {
        return this.salario / 100 * BONUS_PERCENTUAL;
    }
}
