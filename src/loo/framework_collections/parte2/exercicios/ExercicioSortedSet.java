package loo.framework_collections.parte2.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExercicioSortedSet {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(22);
        numeros.add(4);
        numeros.add(5);
        numeros.add(19);

        SortedSet<Integer> numerosSorted = new TreeSet<Integer>(numeros);
        System.out.println(numerosSorted);
    }


    /*
    boolean add(Object o): adiciona o elemento especificado no conjunto se ele ainda "não" estiver presente.

    boolean addAll(Collection c): adiciona todos os elementos do conjunto especificado.

    void clear(): remove todos os elementos do conjunto.

    boolean contains(Object o): retorna verdadeiro se o elemento especificado pertence/está contido no conjunto.

    Object first(): retorna o primeiro elemento do conjunto classificado.

    Iterator iterator(): retorna um iterador sobre os elementos do conjunto.

    Object last(): retorna o ultimo elemento do conjunto classificado.

    boolean remove(Object o): remove o elemento especificado do conjunto se ele estiver presente.

    int size(): retorna o número de elementos do conjunto (sua cardinalidade).

    SortedSet subSet(Object o1, Object o2): retorna um subconjunto formado pelos elementos do conjunto compreendidos
    do elemento "o1", até o elemento "o2". Incluindo "o1" e excluindo "o2" no resultado.

    */

}
