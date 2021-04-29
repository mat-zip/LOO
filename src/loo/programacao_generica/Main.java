package loo.programacao_generica;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*String[] nomes = {"Matheus", "Luiz", "Carlos", "Sarah", "Eduardo"};
        Double[] salarios = {1200.5,1123.5,1441.5,1958.55,1850.5};
        Integer[] idades = {19,20,19,19,21};

        Buscas b = new Buscas();
        System.out.println(b.binary(nomes, "Matheus"));
        System.out.println(b.binary(salarios, 1200.5));
        System.out.println(b.binary(idades, 19));
        */

        //Number n = chosse(new Integer(1), new Double(0.5));

        /*
        Com programação genérica pura:
         */
//        List<Integer> ints = new ArrayList<Integer>();
//        List<Double> dbs = new ArrayList<Double>();
//        Object numbers = chosse(ints, dbs);

        /*
        Com Wildcards
         */

        List<Integer> ints = new ArrayList<Integer>();
        List<Double> dbs = new ArrayList<Double>();
        List<? extends Number> numbers = chosse(ints, dbs);



    }

    public static <E> void imprima(E[] elements) {
        for(E e: elements) {
            System.out.println(e);
        }
    }

    public static <T> T chosse(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}
