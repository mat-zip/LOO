package loo.framework_collections.parte2;

import java.util.Comparator;

public class InverseComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        if (n1 < n2) {
            return 1;
        }else if (n1 > n2) {
            return -1;
        } else {
            return 0;
        }
    }
}
