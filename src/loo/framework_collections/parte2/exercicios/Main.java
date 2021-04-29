package loo.framework_collections.parte2.exercicios;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> dominio = new ArrayList<Integer>();
        dominio.add(1);
        dominio.add(2);
        dominio.add(3);
        Collection<Integer> imagem = new ArrayList<Integer>();
        dominio.add(2);
        dominio.add(3);
        dominio.add(4);
        CalculadoraDeConjuntos c = new CalculadoraDeConjuntos(dominio, imagem);

        c.interseccao();
    }
}
