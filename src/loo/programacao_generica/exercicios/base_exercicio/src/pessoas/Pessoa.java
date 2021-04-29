package loo.programacao_generica.exercicios.base_exercicio.src.pessoas;

/**
 * Created by andresporfirio on 04/05/17.
 */
public abstract class Pessoa implements Comparable<Pessoa> {
    private int cpf;
    private String nome;

    public Pessoa(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.cpf - o.getCpf();
    }
}
