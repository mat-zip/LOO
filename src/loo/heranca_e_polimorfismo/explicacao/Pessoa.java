package loo.heranca_e_polimorfismo.explicacao;

public class Pessoa {
    protected String nome;

    public Pessoa() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + ";");
    }

}
