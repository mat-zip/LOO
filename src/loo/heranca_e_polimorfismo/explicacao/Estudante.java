package loo.heranca_e_polimorfismo.explicacao;

public class Estudante extends Pessoa{
    private String ra;

    public String getRa() {
        return ra;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + "RA: " + ra + ";");
    }
}
