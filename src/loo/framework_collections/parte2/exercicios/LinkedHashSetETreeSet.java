package loo.framework_collections.parte2.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetETreeSet {
    public static void main(String[] args) {
        Collection<String> funcionarios = new ArrayList<>();
        funcionarios.add("Matheus");
        funcionarios.add("Thiago");
        funcionarios.add("Amanda");
        funcionarios.add("Luiz");
        funcionarios.add("Thiago");
        funcionarios.add("Amanda");
        funcionarios.add("Marco");
        funcionarios.add("Isa");

        //Aqui a LinkedHashSet vai apenas manter os elementos na sua ordem de inserção e retirar os duplicados
        //não tendo uma lógica para a ordenação dos elementos
        Collection<String> funcionariosLinkedHasSet = new LinkedHashSet<String>(funcionarios);

        //Aqui além de a TreeSet retirar os elementos duplicados ela ainda vai ordenar os
        //elementos de forma natural ex: 1 2 3, "A, ,B ,C"
        Collection<String> funcionariosTreeSet = new TreeSet<String>(funcionarios);

        System.out.println("Functionarios = " + funcionarios);
        System.out.println("Funcionarios LinkedHashSet = " + funcionariosLinkedHasSet);
        System.out.println("Funcionarios TreeSet = " + funcionariosTreeSet);
    }


}
