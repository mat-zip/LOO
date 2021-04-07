package loo.conceitos_orientacao_objetos.encapsulamento;

public class Main {
    public static void main(String[] args){
//        Divisao d = new Divisao();
//
//        d.setNum1(10);
//        d.setNum2(3);
//        d.divisao();

        Conta c = new Conta();
        c.setAgencia("3769");
        c.setNumero("0001");
        c.deposito(1500);
        c.saque(1000);
        c.saldo();
    }
}
