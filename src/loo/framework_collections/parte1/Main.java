package loo.framework_collections.parte1;

import loo.framework_collections.parte1.codigo_base_exercicio_iterador.MyCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //forEach();
        //iterador();

        //uasColecoes d = new DuasColecoes();
        //System.out.println(d.imprime());
        //d.percorreEmPares();

        MyCollection mc = new MyCollection();
        mc.add("Bandido");
        mc.add("Bodacious");
        mc.add("Mascherano");
        mc.add("Destruidor");
        mc.add("Insano");
        mc.add("Juízo Final");
        mc.add("Tsunami");
        Iterator<String> it = mc.iterator();
        it.next();

        /*while(it.hasNext()) {
            System.out.println(it.next());
        }*/
    }

    public static void forEach() {
        ArrayList<Integer> alist = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            alist.add(i);
        }

        System.out.println("before:" + alist);

        for (Integer i : alist) {
            if (i == 4) {
                alist.remove(i);
                //Tive que colocar o break porque se não acontece uma ConcurrentModificationException
                break;
            }
        }

        System.out.println(" after:" + alist);
    }

    public static void iterador() {
        ArrayList<Integer> alist = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            alist.add(i);
        }

        System.out.println("before:" + alist);
        Iterator<Integer> it = alist.iterator();

        while (it.hasNext()) {
            Integer currentInt = it.next();
            if (currentInt == 4) {
                it.remove();
            }
        }

        System.out.println(" after:" + alist);
    }
}