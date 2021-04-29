package loo.programacao_generica;

public class No <T>{
    private T objeto;
    private No<T> proximo;

    public No(T objeto) {
        this.objeto = objeto;
    }

    public No<T> getProximo() {
        return this.proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public T getObjeto() {
        return this.objeto;
    }
}
