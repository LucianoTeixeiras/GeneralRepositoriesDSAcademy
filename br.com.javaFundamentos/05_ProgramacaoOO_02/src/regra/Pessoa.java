package regra;

public class Pessoa {

    String nome;
    String sobrenome;
    int idade;
    String sexo;

    String pais;

    public Pessoa(){

    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){

        if (idade < 0 || idade > 150){

            throw new IllegalArgumentException("Idade Inválida!");
        }
        else {

            this.idade = idade;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
