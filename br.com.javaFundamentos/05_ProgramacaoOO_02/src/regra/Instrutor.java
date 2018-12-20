package regra;

import interfaces.Palestrante;

public class Instrutor extends Funcionario implements Palestrante {

    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public float getBonusPalestras() {
        return 500;
    }
}
