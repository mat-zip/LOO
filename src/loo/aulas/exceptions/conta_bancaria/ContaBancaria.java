package loo.aulas.exceptions.conta_bancaria;

public class ContaBancaria {
    private double saldo;
    private String nome;

    public ContaBancaria(String nome, double saldo) throws Exception{
        setSaldo(saldo);
        setNome(nome);
    }

    public void saca(double valor) {
        if (this.saldo < valor) {
            String msg = "Impossível realizar o saque, seu saldo é de R$"+this.saldo +
                    " o valor desejado é de R$" + valor;
            throw new SaldoIsuficienteException(msg);
        }

        this.saldo -=valor;
    }

    public void deposita(double valor) {
        if (valor < 0) {
            String msg = "[EROO] - O valor do parâmetro não pode ser negativo";
            throw new IllegalArgumentException(msg);
        }

        this.saldo += valor;
    }

    private void setSaldo(double valor) {
        if(valor < 0) {
            throw new SaldoNegativoException("Não é possivel criar uma conta com saldo negativo");
        }
        this.saldo = valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setNome(String nome) {
        //Retira todos os espaços do nome
        String nomeSemEspaco = nome.replaceAll(" ", "");

        //Faz a verificação letra por letra
        for (int i = 0;i < nomeSemEspaco.length(); i++){
            char cadaLetra = nomeSemEspaco.charAt(i);

            if (!Character.isUpperCase(cadaLetra)) {
                throw new LetraNaoEMaiusculaException("[ERRO] - Insira apenas letras maiusculas");
            }
            if (!Character.isLetter(cadaLetra)) {
                throw new CaractereNaoELetraException("[ERRO] - Seu nome não deve conter números");
            }
        }

        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
