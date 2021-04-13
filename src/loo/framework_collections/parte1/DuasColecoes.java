package loo.framework_collections.parte1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DuasColecoes {
    Collection<Integer> colecao1 = new ArrayList<Integer>();
    Collection<Integer> colecao2 = new ArrayList<Integer>();

    public DuasColecoes() {
        // Colecao1: 1,2,3,4,5,6,7,8,9,10
        for (int i = 1; i <= 10; i++) {
            colecao1.add(i);
        }
        
        //Colecao2: 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        for (int i = 1; i <= 20; i++) {
            colecao2.add(i);
        }
    }

    public void percorreEmParalelo() {
        Iterator<Integer> iterator1 = colecao1.iterator();
        Iterator<Integer> iterator2 = colecao2.iterator();

        while (iterator1.hasNext()) {
            Integer currentInt1 = iterator1.next();
            Integer currentInt2 = iterator2.next();

            //--Verifica se é par e remove
            if (iterator2.next() % 2 == 0) {
                iterator2.remove();
            }

            System.out.println(currentInt1 + "/" + currentInt2);
        }
    }

    public void percorreEmPares() {
        Iterator<Integer> iterator1 = colecao1.iterator();
        Iterator<Integer> iterator2 = colecao2.iterator();

        while (iterator1.hasNext()) {
            Integer currentInt1 = iterator1.next();

            iterator2.next();
            Integer currentInt2 = iterator2.next();

            System.out.println(currentInt1 + "/" + currentInt2);
        }
    }

    public String imprime() {
        String aux = colecao1.toString() + "\n" + colecao2.toString();
        return aux;
    }

}
