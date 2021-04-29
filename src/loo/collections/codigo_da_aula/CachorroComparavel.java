package main;

/**
 * Created by andresporfirio on 27/09/18.
 */
public class CachorroComparavel implements Comparable<CachorroComparavel> {

    private int idade;
    private String nome;

    public CachorroComparavel(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CachorroComparavel{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                "}\n";
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(CachorroComparavel o) {
        if( this.idade > o.idade)
            return 1;
        else if(this.idade < o.idade)
            return -1;
        return 0;
    }
}
