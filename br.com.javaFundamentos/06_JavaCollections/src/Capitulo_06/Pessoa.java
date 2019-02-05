package Capitulo_06;

public abstract class Pessoa implements Guardavel {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
