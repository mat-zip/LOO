package loo.programacao_generica.exercicios.base_exercicio.src.pessoas;

/**
 * Created by andresporfirio on 04/05/17.
 */
public class Trabalhador extends Pessoa {

    private int ctps;

    public Trabalhador(int cpf, String nome, int ctps) {
        super(cpf, nome);
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        return "\nTRABALHADOR:"+getNome()+"\tCPF:"+getCpf()+"\tCTPS:"+ctps;
    }
}
