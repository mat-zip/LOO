package loo.framework_collections.parte2.exercicios;

import java.util.Comparator;

public class ComparadorUniao implements Comparator<Integer> {

    @Override
    public int compare(Integer n1, Integer n2) {
        if (n1 > n2) {
            return 1;
        } else {
            return 0;
        }
    }
}
