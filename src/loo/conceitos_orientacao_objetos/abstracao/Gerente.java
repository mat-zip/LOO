package loo.conceitos_orientacao_objetos.abstracao;

public class Gerente extends Funcionario implements Autenticavel{
    private int senha;

    public boolean autentica(int senha) {
        if(this.senha != senha) {
            return false;
        }
        return true;
    }


    @Override
    public double getBonificacao() {
        return this.salario * 1.4 + 1000;
    }
}
