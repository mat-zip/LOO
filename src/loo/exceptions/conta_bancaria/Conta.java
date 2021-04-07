package loo.exceptions.conta_bancaria;

public class Conta {
    private double saldo, limite;

    public void deposita(double quantidade) {
        saldo += quantidade;
    }

    public void saca(double quantidade) throws Exception {
        if(quantidade > saldo + limite){
            //System.out.println("Erro: quantidade fora do limite!");
            throw new Exception("Erro: quantidade fora do limite!");
        }else {
            saldo -= quantidade;
        }
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
