package loo.aulas.exceptions.conta_bancaria;

public class SaldoNegativoException extends RuntimeException{
    public SaldoNegativoException(String msg) {
        super(msg);
    }
}
