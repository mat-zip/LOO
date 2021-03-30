package loo.aulas.exceptions.conta_bancaria;

public class CaractereNaoELetraException extends RuntimeException {
    public CaractereNaoELetraException (String msg) {
        super(msg);
    }
}
