package loo.conceitos_orientacao_objetos.abstracao;

public abstract class Conta {
    protected String titular;
    protected String numero;
    protected String agencia;
    protected String saldo;

    public abstract String getTipo();

    public abstract String recuperaDadosParaImpressao();
}
