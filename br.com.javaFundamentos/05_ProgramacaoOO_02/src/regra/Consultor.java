package regra;

import interfaces.Palestrante;

public class Consultor extends Pessoa implements Palestrante {

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public float getBonusPalestras() {
        return 1000;
    }

    /*@Override
    public float getGastosPalestras() {
        return 0;
    }*/
}
