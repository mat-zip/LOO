package loo.programacao_generica.exercicios.base_exercicio.src.pessoas;

/**
 * Created by andresporfirio on 04/05/17.
 */
public class Estudante extends Pessoa {

    private int ra;

    public Estudante(int cpf, String nome, int ra) {
        super(cpf, nome);
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "\nESTUDANTE:"+getNome()+"\t\tCPF:"+getCpf()+"\tRA:"+ra;
    }
}
