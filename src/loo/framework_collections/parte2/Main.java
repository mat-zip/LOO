package loo.framework_collections.parte2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> elementos = new ArrayList<Integer>();
        elementos.add(2);
        elementos.add(2);
        elementos.add(3);
        elementos.add(45);
        elementos.add(45);
        elementos.add(12);
        elementos.add(3);
        elementos.add(35);

        //Apenas remove os elementos duplicados mas não conserva a ordem de inserção
        Collection<Integer> noDups = new HashSet<Integer>(elementos);

        //Conserva a ordem em que os elementos foram adicionados
        Collection<Integer> noDupsInsertionOrder = new LinkedHashSet<Integer>(elementos);

        //Retira os elementos duplicados e ordena segundo a sequência natural
        Collection<Integer> noDupsNaturalOrder = new TreeSet<Integer>(elementos);

        //Cria uma coleção que ordena em ordem decrescente
        Collection<Integer> noDupsInverseOrder = new TreeSet<Integer>(new InverseComparator());
        //Adiciona os elementos na coleção
        noDupsInverseOrder.addAll(elementos);

        System.out.println("ArrayList = " + elementos);
        System.out.println("HashSet = " + noDups);
        System.out.println("LinkedHashSet = " + noDupsInsertionOrder);
        System.out.println("TreeSet = "+ noDupsNaturalOrder);
        System.out.println("TreeSetInvertido = " + noDupsInverseOrder);


    }
}
