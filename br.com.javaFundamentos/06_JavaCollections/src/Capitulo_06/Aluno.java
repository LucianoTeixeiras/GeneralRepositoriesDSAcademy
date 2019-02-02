package Capitulo_06;

public class Aluno extends Pessoa {

    private float nota;
    private int matricula;

    public Aluno(String nome, float nota) {

        this.setNome(nome);
        this.nota = nota;

    }

    public Aluno(int matricula, String nome, float nota){

        this(nome,nota);
        this.matricula = matricula;
    }

    public Aluno(String nome, float nota) {
        super();
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return this.getNome();
    }

    @Override
    public boolean equals(Object obj) {
        return this.getMatricula() == ((Aluno)obj.).getMatricula();
    }
}
