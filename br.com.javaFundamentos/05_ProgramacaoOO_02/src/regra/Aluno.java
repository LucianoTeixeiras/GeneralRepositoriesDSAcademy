package regra;

import interfaces.Palestrante;

public class Aluno extends Pessoa implements Palestrante {

    private int numeroMatricula;
    private String curso;

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public float getBonusPalestras() {
        return 0;
    }
}
