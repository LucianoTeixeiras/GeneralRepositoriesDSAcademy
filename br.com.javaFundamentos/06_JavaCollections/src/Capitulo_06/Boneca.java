package Capitulo_06;

import java.util.List;

/**
 * Created by suemareverton on 12/07/17.
 */
public class Boneca extends Brinquedo implements Guardavel {

    private String corRoupa;

    public static void add(List<Boneca> bonecas) {

            }

    public String getCorRoupa() {
        return corRoupa;
    }

    public void setCorRoupa(String corRoupa) {
        this.corRoupa = corRoupa;
    }
}
