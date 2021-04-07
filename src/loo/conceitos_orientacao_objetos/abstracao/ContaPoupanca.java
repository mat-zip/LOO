package loo.conceitos_orientacao_objetos.abstracao;


public class ContaPoupanca extends Conta {

    public String getTipo() {
        return "Conta Poupança";
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.agencia;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        dados += "\nTipo: " + this.getTipo();

        return dados;
    }
}
