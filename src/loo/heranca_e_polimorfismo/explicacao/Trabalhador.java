package loo.heranca_e_polimorfismo.explicacao;

public class Trabalhador extends Pessoa{
    private String ctps;

    public String getCTPS() {
        return ctps;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + " Carteira de Trabalho: " + ctps + "; ");
    }

}
