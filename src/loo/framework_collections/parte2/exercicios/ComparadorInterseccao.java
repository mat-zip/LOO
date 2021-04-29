package loo.framework_collections.parte2.exercicios;

import java.util.Comparator;

public class ComparadorInterseccao implements Comparator<Integer> {

    @Override
    public int compare(Integer n1, Integer n2) {
        if (!n1.equals(n2)) {
            return -1;
        } else {
            return 0;
        }
    }
}
