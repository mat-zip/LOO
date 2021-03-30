package loo.aulas.exceptions.conta_bancaria;

public class SaldoIsuficienteException extends RuntimeException{
    public SaldoIsuficienteException(String mensagem) {
        super(mensagem);
    }
}
