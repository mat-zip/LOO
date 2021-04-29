package loo.programacao_generica;

public class ListaEncadeada <T>{
    private No<T> primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public void inserir(T elemento) {
        No<T> no = new No<T>(elemento);
        no.setProximo(this.primeiro);
        this.primeiro = no;
    }

    public T encontre(T elemento) {
        No<T> atual = primeiro;
        while (!atual.getObjeto().equals(elemento)) {
            if (atual.getProximo() == null){
                return null;
            } else {
                atual = atual.getProximo();
            }
        }
        return atual.getObjeto();
    }

    public void imprime() {
        No<T> atual = primeiro;
        while(atual != null) {
            System.out.println(atual.getObjeto());
            atual = atual.getProximo();
        }
    }

}
