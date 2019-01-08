package Capitulo_06;

public class Aluno extends Pessoa {

    private float nota;

    public Aluno(String nome, float nota) {

        this.setNome(nome);
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
