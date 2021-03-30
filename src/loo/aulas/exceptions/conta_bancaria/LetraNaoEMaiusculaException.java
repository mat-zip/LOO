package loo.aulas.exceptions.conta_bancaria;

public class LetraNaoEMaiusculaException extends RuntimeException{
    public LetraNaoEMaiusculaException(String msg) {
        super(msg);
    }
}
