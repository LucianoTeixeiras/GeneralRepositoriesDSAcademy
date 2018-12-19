package Capitulo_05;

public class Funcionario extends Pessoa{

    private String cargo;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String cargo, float salario) {
        super(nome, sobrenome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}