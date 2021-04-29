package loo.framework_collections.parte2.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CalculadoraDeConjuntos {
    private Collection<Integer> dominio;
    private Collection<Integer> imagem;

    public CalculadoraDeConjuntos(Collection<Integer> dominio, Collection<Integer> imagem ) {
        this.dominio = dominio;
        this.imagem = imagem;
    }


    public void uniao() {
        Collection<Integer>uniao = new TreeSet<>();
        uniao.addAll(dominio);
        uniao.addAll(imagem);

        System.out.println(uniao);

    }

    public void interseccao() {
        Collection<Integer>interseccao = new TreeSet<>();

    }

    public void diferenca() {

    }

}
