package loo.conceitos_orientacao_objetos.encapsulamento;

public class Conta {
    private String agencia;
    private String numero;
    private float saldo;

    public Conta() {
    }

    public void saque(float valor) {
        if(saldo < valor) {
            System.out.println("[ERRO] - O Saldo é insuficiente");
        } else {
            saldo = saldo - valor;
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void deposito(float valor) {
        saldo = saldo + valor;
    }

    public void saldo() {
        System.out.println("o saldo é de: " + saldo);
    }
}
